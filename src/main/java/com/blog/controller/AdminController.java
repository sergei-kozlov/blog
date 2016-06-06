//package com.blog.controller;
//
//import com.blog.services.BlogService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpSession;
//import java.util.Locale;
//
//@Controller
//public class AdminController {
//
//    private BlogService blogService;
//
//    @Autowired
//    public AdminController(BlogService blogService) {
//        this.blogService = blogService;
//    }
//
//    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
//    public String homePage(Model model, HttpSession session, Locale locale) {
//        model.addAttribute("articles", blogService.getAllArticles());
//        return "index";
//    }
//}
