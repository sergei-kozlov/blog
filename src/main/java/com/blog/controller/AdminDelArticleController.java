package com.blog.controller;

import com.blog.model.Users;
import com.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Sergey on 06.06.2016.
 */
public class AdminDelArticleController {
    private BlogService blogService;

    @Autowired
    public AdminDelArticleController(BlogService blogService) {
        this.blogService = blogService;
    }








}
