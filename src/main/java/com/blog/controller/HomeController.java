package com.blog.controller;

import com.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Sergey on 18.05.2016.
 */
@Controller

public class HomeController {

    @Autowired
    public BlogService blogService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("articles", blogService.getAll());
        return "index";
    }

    @RequestMapping(value = "/article")
    public String articlePage(@RequestParam("id") int id, Model model) {
        model.addAttribute("text", blogService.getById(id));
        return "article";
    }

    @RequestMapping(value ="/savetodb", method = RequestMethod.GET)
    public String registration(){
        return "savetodb";
    }
}











