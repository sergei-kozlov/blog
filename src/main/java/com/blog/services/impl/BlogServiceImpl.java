package com.blog.services.impl;

import com.blog.model.Articles;
import com.blog.model.Users;
import com.blog.repository.ArticleRepository;
import com.blog.repository.UserRepository;
import com.blog.services.BlogService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Repository
@Transactional
public class BlogServiceImpl implements BlogService {


    private ArticleRepository articleRepository;
    private UserRepository userRepository;


    @Autowired
    public BlogServiceImpl(ArticleRepository articleRepository, UserRepository userRepository) {
        this.articleRepository = articleRepository;
        this.userRepository = userRepository;
    }

    public List<Articles> getAll() {
        return Lists.newArrayList(articleRepository.findAll());
    }

    public List<Articles> findByTitle(String title) {
        return articleRepository.findByTitle(title);
    }

    public List<Articles> getById(int id) {
        return articleRepository.getById(id);
    }

    public void insert(Users users) {
        userRepository.save(users);
    }


}
