package com.osp.gate.secruity.dao;

import java.util.ArrayList;
import java.util.List;

import com.osp.gate.secruity.model.UcRole;
import com.osp.gate.secruity.model.bo.UcRolePermissionAllocationBo;


public interface UcRoleMapper {

	ArrayList<UcRole> selectAllRoles();

	int deleteByPrimaryKey(Integer roleId);
	
	int findCount();
	
	int insert(UcRole record);

	int insertSelective(UcRole record);

	UcRole selectByPrimaryKey(Integer roleId);

	int updateByPrimaryKeySelective(UcRole record);

	int updateByPrimaryKey(UcRole record);
		
	List<UcRolePermissionAllocationBo> selectPermissionByRoleIds();
	
	/**
	 * 根据用户ID 获取用户的所有权限
	 * @param userId
	 * @return
	 */
	List<UcRole> findAllPermissionByUser(Integer userId);
	
	/**
	 * 获取所有权限
	 * @return
	 */
	List<UcRole> findAllPermission();

}