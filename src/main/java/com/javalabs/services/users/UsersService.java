package com.javalabs.services.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	@Autowired
	private UserRepository userRepo;

	public List<UserEntity> getAllUsers() {
		return userRepo.findAll();
	}

	public UserEntity addUser(UserEntity user) {
		return userRepo.save(user);
	}

	public UserEntity findByName(String userName) {
		return userRepo.findByuserName(userName);
	}
}
