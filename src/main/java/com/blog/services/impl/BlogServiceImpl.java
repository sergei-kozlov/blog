package com.blog.services.impl;

import com.blog.model.Articles;
import com.blog.repository.ArticleRepository;
import com.blog.services.BlogService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ArticleRepository articleRepository;


    public List<Articles> getAll() {
      return Lists.newArrayList(articleRepository.findAll());
    }

    public List<Articles> findByTitle(String title) {
        return articleRepository.findByTitle(title);
    }

    public List<Articles> getById(int id) { return articleRepository.getById(id);}
}
