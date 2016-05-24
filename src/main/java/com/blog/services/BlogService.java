package com.blog.services;

import com.blog.model.Articles;

import java.util.List;

/**
 * Created by Sergey on 18.05.2016.
 */
public interface BlogService {

     List<Articles> getAll();
     List<Articles> findByTitle(String title);
     List<Articles> getById(int id);

}
