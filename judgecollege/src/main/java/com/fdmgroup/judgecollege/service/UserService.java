package com.fdmgroup.judgecollege.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.fdmgroup.judgecollege.dao.UserRepo;
import com.fdmgroup.judgecollege.entity.User;

@Service
@Transactional
public class UserService {
	
	private final UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		for(User user: userRepo.findAll()){
			users.add(user);
		}
		return users;
	}
	
	public void add(User user){
		userRepo.save(user);
		
	}

}
