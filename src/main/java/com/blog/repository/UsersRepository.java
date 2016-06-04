package com.blog.repository;

import com.blog.model.Users;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;


public interface UsersRepository extends CrudRepository<Users, String> {

}
