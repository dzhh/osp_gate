package com.osp.gate.secruity.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 
 * @author fly
 *
 */
public class UcUser extends User {
	
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	public UcUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,String name) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.name = name;
    }
	
//	public UcUser(Integer userId, String userName, String userPwd, 
//			boolean enabled, List<GrantedAuthority> grantedAuthorities) {
////		super();
//		super(userName, userPwd, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
//	       
//		this.userId = userId;
//		this.userName = userName;
//		this.userPwd = userPwd;
//		this.enabled = enabled;
//		this.grantedAuthorities = grantedAuthorities;
//	}
	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;
	private List<GrantedAuthority> grantedAuthorities;
	private Integer userId;
	private String userName;
	private String userPwd;
	private String systemcode;
	private String createTime;
	private String lastLoginTime;
	private String userEmail;
	private String newPwd;
	private Integer status;
	private Integer key;//前台需要
	private boolean enabled;  
	

	@Override
	public String getPassword() {
		return userPwd;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd == null ? null : newPwd.trim();
	}

	public String getNewPwd() {
		return newPwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column uc_user.user_id
	 *
	 * @return the value of uc_user.user_id
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column uc_user.user_id
	 *
	 * @param userId
	 *            the value for uc_user.user_id
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column uc_user.user_name
	 *
	 * @return the value of uc_user.user_name
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column uc_user.user_name
	 *
	 * @param userName
	 *            the value for uc_user.user_name
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column uc_user.user_pwd
	 *
	 * @return the value of uc_user.user_pwd
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public String getUserPwd() {
		return userPwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column uc_user.user_pwd
	 *
	 * @param userPwd
	 *            the value for uc_user.user_pwd
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd == null ? null : userPwd.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column uc_user.systemcode
	 *
	 * @return the value of uc_user.systemcode
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public String getSystemcode() {
		return systemcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column uc_user.systemcode
	 *
	 * @param systemcode
	 *            the value for uc_user.systemcode
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public void setSystemcode(String systemcode) {
		this.systemcode = systemcode == null ? null : systemcode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column uc_user.create_time
	 *
	 * @return the value of uc_user.create_time
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column uc_user.create_time
	 *
	 * @param createTime
	 *            the value for uc_user.create_time
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime == null ? null : createTime.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column uc_user.last_login_time
	 *
	 * @return the value of uc_user.last_login_time
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public String getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column uc_user.last_login_time
	 *
	 * @param lastLoginTime
	 *            the value for uc_user.last_login_time
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime == null ? null : lastLoginTime.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column uc_user.user_email
	 *
	 * @return the value of uc_user.user_email
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column uc_user.user_email
	 *
	 * @param userEmail
	 *            the value for uc_user.user_email
	 *
	 * @mbg.generated Wed Aug 09 18:34:31 CST 2017
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getKey() {
		return key;
	}

	public List<GrantedAuthority> getGrantedAuthorities() {
		return grantedAuthorities;
	}

	public void setGrantedAuthorities(List<GrantedAuthority> grantedAuthorities) {
		this.grantedAuthorities = grantedAuthorities;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
}