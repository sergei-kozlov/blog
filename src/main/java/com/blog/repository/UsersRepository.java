package com.blog.repository;

import com.blog.model.Users;
import org.springframework.data.repository.CrudRepository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UsersRepository extends CrudRepository<Users, String> {


}
