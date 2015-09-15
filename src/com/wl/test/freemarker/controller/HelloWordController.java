package com.wl.test.freemarker.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWordController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest arg0,
            HttpServletResponse arg1) throws Exception {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("title", "Spring MVC And Freemarker");
        mv.addObject("content", " Hello world £¬ test my first spring mvc ! ");
        return mv;
    }

}
