package com.blog.controller;

import com.blog.model.Users;
import com.blog.services.BlogService;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;

///**
// * Created by Sergey on 25.05.2016.
// */
//@Controller
//public class RegistrationController {
//
//    @Autowired
//    private BlogService blogService;
//
//    @RequestMapping("/registration")
//    public String setupForm(Map<String, Object> map){
//        Users users = new Users();
//        map.put("reguser",users);
//        return "reguser";
//
//    }
//
//
//
//    @RequestMapping(value = "/check-user", method = RequestMethod.POST)
//
//    public String regUser(@ModelAttribute Users users, BindingResult result, @RequestParam  String action, Map<String, Object> map){
//        Users userResult = new Users();
//        blogService.saveByLogin(users);
//        userResult = users;
//        return "index";
//
//    }
//
//}

//@Controller
//public class RegistrationController {
//
//    private BlogService blogService;
//    private static final String CHECK_REGISTRATION = "check";
//
//    @Autowired
//    public RegistrationController(BlogService blogService) {
//        this.blogService = blogService;
//    }
//
//
//
//
//    @RequestMapping(value = "/savtodb", method = RequestMethod.POST)
//    public String processCreationUser(Users users, BindingResult result, ModelMap model) {
//
//
//
//            owner.addPet(pet);
//            this.clinicService.savePet(pet);
//            return "redirect:/owners/{ownerId}";
//        }
//    }
//
//}
//

