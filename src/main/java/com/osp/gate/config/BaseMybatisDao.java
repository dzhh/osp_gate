package com.osp.gate.config;

import java.lang.reflect.ParameterizedType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * 基础MybatisDao，与分页有关的服务都走这个类
 * 
 * @author zhangmingcheng
 */
@SuppressWarnings({ "unchecked" })
public class BaseMybatisDao<T> extends SqlSessionDaoSupport {

	private String NAMESPACE;
	final static Class<? extends Object> SELF = BaseMybatisDao.class;
	protected final Log logger = LogFactory.getLog(BaseMybatisDao.class);
	/** 默认的查询Sql id */
	final static String DEFAULT_SQL_ID = "findAll";
	/** 默认的查询Count sql id **/
	final static String DEFAULT_COUNT_SQL_ID = "findCount";

	/**
	 * Autowired 必须要有 ，mybatis-spring-1.3.0中取消了自动注入SqlSessionFactory 和
	 * SqlSessionTemplate.
	 */
	@Autowired
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	public BaseMybatisDao() {
		try {
			// getGenericSuperclass()获得带有泛型的父类
			// 返回值Type：Type是 Java
			// 编程语言中所有类型的公共高级接口。它们包括原始类型、参数化类型、数组类型、类型变量和基本类型。
			Object genericClz = getClass().getGenericSuperclass();
			if (genericClz instanceof ParameterizedType) {
				Class<T> entityClass = (Class<T>) ((ParameterizedType) genericClz).getActualTypeArguments()[0];
				// 如 NAMESPACE=com.sojson.common.dao.UcUserMapper
				NAMESPACE = entityClass.getPackage().getName() + "." + entityClass.getSimpleName();
			}
		} catch (RuntimeException e) {
			System.out.println("初始化失败，继承BaseMybatisDao，没有泛型！");
		}
	}
	


	
}
