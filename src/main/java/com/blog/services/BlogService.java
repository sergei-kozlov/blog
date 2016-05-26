package com.blog.services;

import com.blog.model.Articles;
import com.blog.model.Simple;
import com.blog.model.Users;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.User;

import java.util.List;

/**
 * Created by Sergey on 18.05.2016.
 */
public interface BlogService {

     List<Articles> getAll() throws DataAccessException;

     List<Articles> findByTitle(String title) throws DataAccessException;

     List<Articles> getById(int id) throws DataAccessException;

     void insert(Users users) throws DataAccessException;












}
