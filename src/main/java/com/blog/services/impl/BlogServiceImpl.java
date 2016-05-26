package com.blog.services.impl;

import com.blog.model.Articles;
import com.blog.model.Simple;
import com.blog.model.Users;
import com.blog.repository.ArticleRepository;
import com.blog.repository.SimpleRepository;
import com.blog.repository.UserRepository;
import com.blog.services.BlogService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sergey on 18.05.2016.
 */
@Service
@Repository
@Transactional
public class BlogServiceImpl implements BlogService{


    private ArticleRepository articleRepository;
    private UserRepository userRepository;
    private SimpleRepository simpleRepository;


    @Autowired
    public BlogServiceImpl(ArticleRepository articleRepository, SimpleRepository simpleRepository, UserRepository userRepository) {
        this.articleRepository = articleRepository;
        this.simpleRepository = simpleRepository;
        this.userRepository = userRepository;
    }

    public List<Articles> getAll() {return Lists.newArrayList(articleRepository.findAll());
    }

    public List<Articles> findByTitle(String title) {
        return articleRepository.findByTitle(title);
    }

    public List<Articles> getById(int id) { return articleRepository.getById(id);}

    public void insert(Users users) { userRepository.save(users);
    }


//    public Users save(Users users) {
//        userRepository.save(users);
//    }


}
