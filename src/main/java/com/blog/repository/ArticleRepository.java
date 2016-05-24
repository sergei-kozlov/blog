package com.blog.repository;

import com.blog.model.Articles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Sergey on 18.05.2016.
 */

public interface ArticleRepository extends CrudRepository<Articles, Integer>{

    List<Articles> findByTitle(String title);
    List<Articles> getById(int id);
}
