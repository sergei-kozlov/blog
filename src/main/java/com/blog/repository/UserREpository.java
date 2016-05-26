package com.blog.repository;

import com.blog.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by Sergey on 24.05.2016.
 */
public interface UserRepository extends CrudRepository<Users, String>{

}
