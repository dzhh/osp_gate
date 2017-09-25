package com.osp.gate.secruity.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.osp.gate.config.BaseMybatisDao;
import com.osp.gate.secruity.dao.UcUserMapper;
import com.osp.gate.secruity.model.UcUser;
import com.osp.gate.secruity.model.bo.UcRoleBo;
import com.osp.gate.secruity.service.UcUserService;


/**
 * 用户业务实现类
 * 
 * @author zhangmingcheng
 */
@Service
@Transactional
@SuppressWarnings("unchecked")
public class UcUserServiceImpl extends BaseMybatisDao<UcUserMapper> implements UcUserService {

	@Autowired
	private UcUserMapper ucUserMapper;


	@Override
	public UcUser login(String username, String password) {
		return ucUserMapper.login(username, password);
	}

	@Override
	public int insert(UcUser record) {
		return ucUserMapper.insert(record);
	}

	@Override
	public int insertSelective(UcUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UcUser selectByPrimaryKey(Integer id) {
		return ucUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(UcUser ucUser) {
		return ucUserMapper.updateByPrimaryKeySelective(ucUser);
	}

	@Override
	public int updateByPrimaryKey(UcUser record) {
		return 0;
	}

	@Override
	public UcUser findUser(Integer userId) {
		return ucUserMapper.findUser(userId);
	}


	@Override
	public int deleteByPrimaryKey(Integer id) {
		return ucUserMapper.deleteByPrimaryKey(id);
	}



	@Override
	public List<UcRoleBo> selectRoleByUserId(Integer id) {
		return ucUserMapper.selectRoleByUserId(id);
	}



	@Override
	public UcUser findUserByUserName(String userName) {
		return ucUserMapper.findUserByUserName(userName);
	}

	@Override
	public Map<String, Object> updateForbidUserById(Integer id, Integer status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> shotOffOnlineUser(UcUser record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> addRole2User(Integer userId, String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteRoleByUserIds(String userIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteUserById(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
