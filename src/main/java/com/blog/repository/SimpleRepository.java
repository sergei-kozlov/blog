package com.blog.repository;

import com.blog.model.Simple;
import com.blog.model.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sergey on 26.05.2016.
 */
public interface SimpleRepository extends CrudRepository<Simple, Integer> {

}
