package com.blog.controller;

import com.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ArticlesController {

    private BlogService blogService;

    @Autowired
    public ArticlesController(BlogService blogService) {
        this.blogService = blogService;
    }


    @RequestMapping(value = "/article")
    public String articlePage(@RequestParam("id") int id, Model model) {
        model.addAttribute("text", blogService.getById(id));
        return "article";
    }
}