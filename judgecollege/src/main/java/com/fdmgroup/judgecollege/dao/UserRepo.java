package com.fdmgroup.judgecollege.dao;

import org.springframework.data.repository.CrudRepository;

import com.fdmgroup.judgecollege.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
