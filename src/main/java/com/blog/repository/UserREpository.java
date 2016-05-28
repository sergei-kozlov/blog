package com.blog.repository;

import com.blog.model.Users;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Users, String> {

}
