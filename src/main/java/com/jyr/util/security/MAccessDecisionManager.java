package com.jyr.util.security;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

public class MAccessDecisionManager implements AccessDecisionManager {
//    authentication    包含了当前的用户信息，包括拥有的权限。这里的权限来源就是前面登录时UserDetailsService中设置的authorities。
//    object            就是FilterInvocation对象，可以得到request等web资源。
//    collection        是本次访问需要的权限。
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        System.err.println(" ---------------  MyAccessDecisionManager --------------- ");
        if(collection == null) {
            return;
        }
        //所请求的资源拥有的权限(一个资源对多个权限)
        for (ConfigAttribute configAttribute : collection) {
            //访问所请求资源所需要的权限
            String needPermission = configAttribute.getAttribute();
            //System.out.println("needPermission is " + needPermission);
            //用户所拥有的权限authentication
            for (GrantedAuthority ga : authentication.getAuthorities()) {
                if (needPermission.equals(ga.getAuthority())) {
                    return;
                }
            }
        }
        //没有权限
        throw new AccessDeniedException(" 没有权限访问！ ");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
