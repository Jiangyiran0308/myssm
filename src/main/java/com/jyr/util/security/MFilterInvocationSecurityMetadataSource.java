package com.jyr.util.security;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author: Jiang
 * @Date: Created in 10:24  2018\11\22 0022
 * @Description:
 * @Modified By:
 */

public class MFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

    private void loadResourceDefine(){

        if(resourceMap == null){
            resourceMap = new HashMap<>();
            List<String> resoures = new ArrayList<>() ;
            resoures.add("/data");
            resoures.add("/test");
            resoures.add("/messagesuccess");
            resoures.add("/messagewarn");
            resoures.add("/messagefail");
            resoures.add("/messageinfo");
            resoures.add("/index.html");
            resoures.add("/home");
            resoures.add("/index");
            resoures.add("/admin");
            resoures.add("/superadmin");
            for(String url : resoures){
                Collection<ConfigAttribute> config = new ArrayList<ConfigAttribute>();
                ConfigAttribute configAttribute = new SecurityConfig("ROLE_USER");
                ConfigAttribute configAttribute2 = new SecurityConfig("ROLE_ADMIN");
                ConfigAttribute configAttribute3 = new SecurityConfig("ROLE_SUPERADMIN");

                config.add(configAttribute);
                config.add(configAttribute2);
                config.add(configAttribute3);

                if(url.equals("/admin")){
                    config.remove(configAttribute);
                }
                if(url.equals("/superadmin")||url.equals("/messagewarn")||url.equals("/messagefail")){
                    config.remove(configAttribute2);
                    config.remove(configAttribute);
                }
                resourceMap.put(url,config);
            }
            System.out.println(resourceMap);
        }
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        System.out.println(requestUrl);
        if(resourceMap == null){
            loadResourceDefine();
        }
        if(requestUrl.indexOf("?")>-1){
            requestUrl=requestUrl.substring(0,requestUrl.indexOf("?"));
        }
        Collection<ConfigAttribute> configAttributes = resourceMap.get(requestUrl);
//        System.out.println(configAttributes.size());
        return configAttributes;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
