package com.osp.gate.secruity.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.osp.gate.secruity.model.UcUser;
import com.osp.gate.secruity.model.bo.UcRoleBo;
import com.osp.gate.secruity.model.bo.UserRoleAllocationBo;


/**
 * 用户业务接口
 * 
 * @author zhangmingcheng
 */
public interface UcUserService {

	Map<String, Object> updateForbidUserById(Integer id,Integer status);

	Map<String, Object> shotOffOnlineUser(UcUser record);

	UcUser login(String username, String password);

	int deleteByPrimaryKey(Integer id);

	int insert(UcUser record);

	int insertSelective(UcUser record);

	UcUser selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(UcUser record);

	int updateByPrimaryKey(UcUser record);

	UcUser findUser(Integer userId);
	
	UcUser findUserByUserName(String userName);

	List<UcRoleBo> selectRoleByUserId(Integer id);

	Map<String, Object> addRole2User(Integer userId, String ids);

	Map<String, Object> deleteRoleByUserIds(String userIds);

	Map<String, Object> deleteUserById(String ids);

}
