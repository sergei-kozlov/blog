package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Sergey on 03.06.2016.
 */
@Controller
public class AddArticle {
    @RequestMapping(value = "/addarticle" , method = RequestMethod.GET)
    public String addArticle(){
        return "addarticle";
    }
}
