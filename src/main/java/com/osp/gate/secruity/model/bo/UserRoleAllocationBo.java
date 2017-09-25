package com.osp.gate.secruity.model.bo;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.osp.gate.secruity.model.UcUser;


/**
 * 用户角色分配 查询列表BO
 * @author zhangmingcheng
 */
public class UserRoleAllocationBo extends UcUser implements Serializable {
	public UserRoleAllocationBo(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,
			String name) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities, name);
	}
	private static final long serialVersionUID = 1L;
	
	//Role Name列转行，以,分割
	private String roleNames;
	//Role Id列转行，以‘,’分割
	private String roleIds;
	
	public String getRoleNames() {
		return roleNames;
	}
	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}
	public String getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}
	
}
