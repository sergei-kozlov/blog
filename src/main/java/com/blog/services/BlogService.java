package com.blog.services;

import com.blog.model.Articles;
import com.blog.model.Users;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.User;

import java.util.List;

/**
 * Created by Sergey on 18.05.2016.
 */
public interface BlogService {

     List<Articles> getAll();

     List<Articles> findByTitle(String title);

     List<Articles> getById(int id);


     void saveByLogin(Users users) throws DataAccessException;

     Users findUserByLogin(String login) throws DataAccessException;









}
