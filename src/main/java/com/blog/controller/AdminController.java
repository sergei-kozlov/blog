package com.blog.controller;

import com.blog.model.Users;
import com.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class AdminController {

    private BlogService blogService;

    @Autowired
    public AdminController(BlogService blogService) {
        this.blogService = blogService;
    }


    @RequestMapping(value = "/adminpage", method = RequestMethod.GET)
    public String homePage(Model model, Users users) {

        model.addAttribute("usersList", blogService.getAllUsers());
        model.addAttribute("articleList", blogService.getAllArticles());

        return "adminpage";

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteArticle(@PathVariable("id") Integer id) {

        blogService.removeArticle(id);

        return "redirect:/adminpage";
    }


    @RequestMapping(value = "/delete/{username}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable("username") String username) {
        blogService.removeUser(username);

        return "redirect:/adminpage";
    }


    @RequestMapping(value = "/amdminpage/add", method = RequestMethod.POST)
    public String processCreationUser(@Valid Users users, BindingResult result) {

        users.setEnabled(true);
        if (result.hasErrors()) {
            return "redirect:/adminpage";
        } else {
            blogService.saveUser(users);
            return "redirect:/adminpage";
        }
    }
}

