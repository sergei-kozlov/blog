package com.blog.controller;

import com.blog.model.Articles;
import com.blog.services.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.sql.Date;
import java.util.Map;

/**
 * Created by Sergey on 03.06.2016.
 */
@Controller
public class AddArticleController {

    private static final Logger logger = LoggerFactory.getLogger(AddArticleController.class);

    @Autowired
    private BlogService blogService;


    @RequestMapping(value = "/addarticle", method = RequestMethod.GET)
    public String initCreationUser(Map<String, Object> model) {
        Articles articles = new Articles();

        model.put("articles", articles);

        return "addarticle";
    }

    @RequestMapping(value = "/article/add", method = RequestMethod.POST)
    public String processCreationUser(@Valid Articles articles, BindingResult result) {







        if (result.hasErrors()) {
            return "index";
        } else {
            blogService.saveArticle(articles);
            return "article";
        }
    }
}


