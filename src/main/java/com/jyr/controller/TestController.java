package com.jyr.controller;

import com.jyr.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @Author: Jiang
 * @Date: Created in 14:24  2018\9\19 0019
 * @Description:
 * @Modified By:
 */
@Controller
@RequestMapping(value = "/",method = RequestMethod.GET)
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String str = "welcome!!!";
        request.setAttribute("test",str);
        return "index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String str = "welcome!!!";
        request.setAttribute("test",str);
        return "login";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public Object testdata(String user) throws IOException, ServletException {
        String str = "welcome!!!";

        System.out.println(user);
//        System.out.println(request);

        Account account = new Account() ;
        account.setId("111111");
        account.setAccountid("123456");
        account.setUsername("jiang");
        account.setPassword("123");

        return account;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public Object testppost(@RequestBody Map info){
        System.out.println(info);
        return info ;
    }

}
