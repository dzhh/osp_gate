package com.osp.gate.secruity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.osp.gate.secruity.model.UcUser;
import com.osp.gate.secruity.model.bo.UcRoleBo;


public interface UcUserMapper {
	
	UcUser login(@Param("username") String username, @Param("password") String password);
	
	UcUser findUser(@Param("userId") Integer userId);
	
	UcUser findUserByUserName(@Param("userName") String userName);
   
    int deleteByPrimaryKey(Integer userId);

    int insert(UcUser record);
    
    int insertSelective(UcUser record);

    UcUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UcUser record);

    int updateByPrimaryKey(UcUser record);
    
	List<UcRoleBo> selectRoleByUserId(@Param("id") Integer id);
}