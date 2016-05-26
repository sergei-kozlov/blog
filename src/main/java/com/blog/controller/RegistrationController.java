package com.blog.controller;

import com.blog.model.Simple;
import com.blog.model.Users;
import com.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;

@Controller
public class RegistrationController {

    private BlogService blogService;

    @Autowired
    public RegistrationController(BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String initCreationUser(Map<String, Object> model) {
        Users users = new Users();
        model.put("users", users);

        return "registration";
    }

    @RequestMapping(value = "/registration/add", method = RequestMethod.POST)
    public String processCreationUser(Users users, BindingResult result) {
        this.blogService.insert(users);

        return "checkuser";
    }
}

