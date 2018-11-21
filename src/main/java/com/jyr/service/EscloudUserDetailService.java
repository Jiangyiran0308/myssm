package com.jyr.service;

import com.jyr.dao.AuthDao;
import com.jyr.model.Role;
import com.jyr.model.UserAccount;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Jiang
 * @Date: Created in 10:47  2018\11\21 0021
 * @Description:
 * @Modified By:
 */
@Service
public class EscloudUserDetailService implements UserDetailsService{
    private AuthDao authDao ;

//    @Resource(name="AuthDao")
//    public void setBaseCollectionDao(AuthDao authDao)
//    {
//        this.authDao = authDao;
//    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("username   =   " + userName );

        UserAccount user = new UserAccount() ;
        if("admin".equals(userName)){
            user.setName("admin");
            user.setPassword("123456");
            user.setAccountNonExpired(true);
            user.setAccountNonLocked(true);
            user.setCredentialsNonExpired(true);
            user.setStatus(1);

            SimpleGrantedAuthority auth = new SimpleGrantedAuthority("ROLE_USER") ;
            List<GrantedAuthority> list = new ArrayList<>();
            list.add(auth) ;

            user.setAuthorities(list);

            Set<Role> roles = new HashSet<Role>() ;
            Role role = new Role();
            role.setRole_name("ROLE_ADMIN");
        }
        System.out.println(user);

        return user;
    }
}
