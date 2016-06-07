package com.blog.services;

import com.blog.model.Articles;
import com.blog.model.Users;
import org.springframework.dao.DataAccessException;

import java.util.List;


public interface BlogService {

    List<Articles> getAllArticles() throws DataAccessException;

    List<Articles> getById(int id) throws DataAccessException;

    void saveArticle(Articles articles) throws DataAccessException;

    void removeArticle(Integer id) throws DataAccessException;



    List<Users> getAllUsers() throws DataAccessException;

    void saveUser(Users users) throws DataAccessException;

    void removeUser(String username) throws DataAccessException;

}
