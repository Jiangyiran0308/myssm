package com.jyr.util.security;

import com.jyr.model.SimpleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jiang
 * @Date: Created in 10:47  2018\11\21 0021
 * @Description:
 * @Modified By:
 */
@Service
public class MUserDetailService implements UserDetailsService{

//    @Resource(name="AuthDao")
//    public void setBaseCollectionDao(AuthDao authDao)
//    {
//        this.authDao = authDao;
//    }
@Autowired
private MessageSource messageSource;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SimpleUser user = new SimpleUser() ;
        if("admin".equals(userName)){
            user.setUserId("1111111124444444432");
            user.setName("admin");
            user.setPassword("123456");
            user.setAccountNonExpired(true);
            user.setAccountNonLocked(true);
            user.setCredentialsNonExpired(true);
            user.setStatus(1);

            SimpleGrantedAuthority auth = new SimpleGrantedAuthority("ROLE_SUPERADMIN") ;
//            SimpleGrantedAuthority auth1 = new SimpleGrantedAuthority("ROLE_USER") ;
            List<GrantedAuthority> list = new ArrayList<>();
            list.add(auth) ;
//            list.add(auth1) ;

            user.setAuthorities(list);

        }

        if("user".equals(userName)){
            user.setUserId("11111111244422224432");
            user.setName("user");
            user.setPassword("123456");
            user.setAccountNonExpired(true);
            user.setAccountNonLocked(true);
            user.setCredentialsNonExpired(true);
            user.setStatus(1);

//            SimpleGrantedAuthority auth = new SimpleGrantedAuthority("ROLE_SUPERADMIN") ;
            SimpleGrantedAuthority auth1 = new SimpleGrantedAuthority("ROLE_USER") ;
            List<GrantedAuthority> list = new ArrayList<>();
//            list.add(auth) ;
            list.add(auth1) ;

            user.setAuthorities(list);

        }
        if(user.getName()== null){
            throw new UsernameNotFoundException("用户不存在");
        }
        System.out.println(user.getName());

        return user;
    }
}
