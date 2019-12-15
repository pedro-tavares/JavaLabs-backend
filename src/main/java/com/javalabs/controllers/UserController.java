package com.javalabs.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javalabs.constants.IConstants;
import com.javalabs.dto.User;
import com.javalabs.services.users.UserEntity;
import com.javalabs.services.users.UserService;

@RestController
@CrossOrigin
@RequestMapping(path = IConstants.PATH_USERS)
public class UserController {

	@Autowired
	UserService service;

	@Autowired
	DozerBeanMapper mapper;

	@RequestMapping(path = IConstants.PATH_ADD_USER, method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		UserEntity entity = service.addUser(new UserEntity(user));
		return mapper.map(entity, User.class);
	}

	@RequestMapping(path = IConstants.PATH_GET_ALL_USERS, method = RequestMethod.GET)
	public List<UserEntity> getAllUsers() {
		return service.getAllUsers();
	}
}
