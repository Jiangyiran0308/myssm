package com.jyr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Jiang
 * @Date: Created in 14:24  2018\9\19 0019
 * @Description:
 * @Modified By:
 */
@Controller
@RequestMapping(value = "/test",method = RequestMethod.GET)
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String str = "welcome!!!";
        request.setAttribute("test",str);
        return "index";
    }

}
