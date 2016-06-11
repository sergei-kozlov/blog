package com.blog.controller;

import com.blog.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error) {

        logger.info(error);

        ModelAndView model = new ModelAndView();
        if (error != null) {

            model.addObject("error", "Login is not correctly! Try again");
        }

        model.setViewName("login");

        return model;
    }
}