package com.blog.repository;

import com.blog.model.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sergey on 01.06.2016.
 */
public interface UsersRepository extends CrudRepository<Users, String> {

}
