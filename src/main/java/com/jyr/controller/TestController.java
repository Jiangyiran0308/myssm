package com.jyr.controller;

import com.jyr.model.AccountUser;
import com.jyr.model.Message.SimpleMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String index(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
//        String str = "welcome!!!";
//        SimpleUser user = (SimpleUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal() ;
//        System.out.println(user.getUserId());
//        request.setAttribute("test",str);
//        return "index";
//    }
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String str = "welcome!!!";
        request.setAttribute("test",str);
        return "admin";
    }
    @RequestMapping(value = "/superadmin", method = RequestMethod.GET)
    public String superadmin(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String str = "welcome!!!";
        request.setAttribute("test",str);
        return "superadmin";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String str = "welcome!!!";
        request.setAttribute("test",str);
        return "login";
    }

    @CrossOrigin
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public Object testdata(String user) throws IOException, ServletException {
        String str = "welcome!!!";

//        System.out.println(user);
//        System.out.println(request);

        AccountUser accountUser = new AccountUser() ;
        accountUser.setId("111111");
        accountUser.setAccountid("123456");
        accountUser.setUsername("jiang");
        accountUser.setPassword("123");

        return accountUser;
    }

    @CrossOrigin
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public Object testppost(@RequestBody Map info){
//        System.out.println(info);
        return info ;
    }

    @CrossOrigin
    @RequestMapping(value = "/messagesuccess", method = RequestMethod.GET)
    @ResponseBody
    public SimpleMessage message(){
        return SimpleMessage.success("成功");
    }

    @RequestMapping(value = "/messageinfo", method = RequestMethod.GET)
    @ResponseBody
    public SimpleMessage message1(){
        return SimpleMessage.info("普通");
    }

    @RequestMapping(value = "/messagewarn", method = RequestMethod.GET)
    @ResponseBody
    public SimpleMessage message2(){
        return SimpleMessage.warn("警告");
    }

    @RequestMapping(value = "/messagefail", method = RequestMethod.GET)
    @ResponseBody
    public SimpleMessage message3(){
        return SimpleMessage.error("错误");
    }

    @RequestMapping(value = "/datainfo", method = RequestMethod.GET)
    @ResponseBody
    public SimpleMessage data1(){
        AccountUser accountUser = new AccountUser() ;
        accountUser.setId("111111");
        accountUser.setAccountid("123456");
        accountUser.setUsername("jiang");
        accountUser.setPassword("123");
        return SimpleMessage.info(accountUser);
    }

    @RequestMapping(value = "/testLogin", method = RequestMethod.POST)
    @ResponseBody
    public SimpleMessage loginAuth(@RequestBody AccountUser accountUser){

        System.out.println(accountUser.getAccountid());
        System.out.println(accountUser.getPassword());

        if(accountUser.getAccountid().equals("admin")){
            if(accountUser.getPassword().equals("123456")){
                accountUser.setUsername("superadmin");
                accountUser.setId("11111111222222");
            }
        }
//        return info ;
        return SimpleMessage.info(accountUser);
    }


}
