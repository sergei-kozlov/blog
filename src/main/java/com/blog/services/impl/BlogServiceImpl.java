package com.blog.services.impl;

import com.blog.model.Articles;
import com.blog.model.Users;
import com.blog.repository.ArticleRepository;
import com.blog.repository.UsersRepository;
import com.blog.services.BlogService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Repository
@Transactional
public class BlogServiceImpl implements BlogService {


    private ArticleRepository articleRepository;
    private UsersRepository usersRepository;

    @Autowired
    public BlogServiceImpl(ArticleRepository articleRepository, UsersRepository usersRepository) {
        this.articleRepository = articleRepository;
        this.usersRepository = usersRepository;
    }


//    public List<Articles> getAllArticles(){
//        return articleRepository.getAllArticles();
//    }

//    @Override
//    public List<Articles> getAllArticles() {
//
//        return Lists.newArrayList(articleRepository.findAll());
//    }
//
//
//    @Override
//    public List<Articles> getById(int id) {
//
//        return articleRepository.getById(id);
//    }
//
//
//    public void saveArticle(Articles articles) throws DataAccessException {
//        this.articleRepository.save(articles);
//    }
//
//
//
//
//
//    @Override
//    public List<Users> getAllUsers() throws DataAccessException {
//        return null;
//    }
//
//    @Override
//    public void saveUser(Users users) throws DataAccessException {
//        this.usersRepository.save(users);
//    }
//
//    @Override
//    public void removeUser(Users users) throws DataAccessException {
//
//    }

    @Override
    public List<Articles> getAll() {

        return Lists.newArrayList(articleRepository.findAll());
    }

    @Override
    public List<Articles> findByTitle(String title) {

        return articleRepository.findByTitle(title);
    }

    @Override
    public List<Articles> getById(int id) {

        return articleRepository.getById(id);
    }

    @Override
    public void saveUser(Users users) throws DataAccessException {

        this.usersRepository.save(users);

    }

    @Override
    public void saveArticle(Articles articles) throws DataAccessException {
        this.articleRepository.save(articles);
    }

}
