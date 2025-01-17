package com.example.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("root.index");
        System.out.println("Checking Index Controller");
        mv.addObject("data", "Hello Spring MVC!");
//        mv.setViewName("/WEB-INF/view/index.jsp");
        //만약 "WEB-INF/view/index.jsp 로 상대경로를 하면 dispatcher-servlet.xml의 bean id를 기준으로 찾아감
        // bean id="/aa/index" 일 때 http://.../aa/index 로 접속 가능하고 view도 "aa/WEB-INF/view/index.jsp"를 찾으려고 시도
        return mv;
    }

}
