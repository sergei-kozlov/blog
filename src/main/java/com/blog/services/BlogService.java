package com.blog.services;

import com.blog.model.Articles;
import com.blog.model.Users;
import org.springframework.dao.DataAccessException;

import java.util.List;


public interface BlogService {



    List<Articles> getAll() throws DataAccessException;

    List<Articles> findByTitle(String title) throws DataAccessException;

    List<Articles> getById(int id) throws DataAccessException;


    void saveUser(Users users) throws DataAccessException;

    void saveArticle(Articles articles) throws DataAccessException;

//    List<Articles> getById(int id) throws DataAccessException;
//
//    List<Articles> getAllArticles() throws DataAccessException;
//
//    void saveArticle(Articles articles) throws DataAccessException;
//
////    void removeArticle(Integer id) throws DataAccessException;
//
//
//    List<Users> getAllUsers() throws DataAccessException;
//
//    void saveUser(Users users) throws DataAccessException;
//
//    void removeUser(Users users) throws DataAccessException;
//




}
