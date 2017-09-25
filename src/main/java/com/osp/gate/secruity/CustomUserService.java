package com.osp.gate.secruity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.osp.gate.secruity.dao.UcRoleMapper;
import com.osp.gate.secruity.dao.UcUserMapper;
import com.osp.gate.secruity.model.UcRole;
import com.osp.gate.secruity.model.UcUser;
import org.apache.commons.lang.StringUtils;


/**
 * 自定义用户服务
 * @author fly
 *
 */
@Service
public class CustomUserService implements UserDetailsService {
    
	@Autowired
	UcUserMapper userDao;
    
    public UserDetails loadUserByUsername(String username) {
        if (StringUtils.isBlank(username)) {
            throw new UsernameNotFoundException("用户名为空");
          }
    	UcUser user = userDao.findUserByUserName(username);
    	
        if (user != null) {
            Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
            return new UcUser(username, user.getUserPwd(),                 
            		true, // 是否可用
                    true, // 是否过期
                    true, // 证书不过期为true
                    true, // 账户未锁定为true, 
                    authorities, user.getUserName());
        } else {
            throw new UsernameNotFoundException("用户: " + username + " do not exist!");
        }
    }

}