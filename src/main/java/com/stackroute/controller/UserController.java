package com.stackroute.controller;

import com.stackroute.configure.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/getdetails")
    public ModelAndView getdetails(@RequestParam("name") String name,@RequestParam("password") String password, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        User user = new User(name,password);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("result",user.toString());
        return modelAndView;
    }
}
