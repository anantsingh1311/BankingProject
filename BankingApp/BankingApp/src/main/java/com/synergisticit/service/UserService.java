package com.synergisticit.service;

import java.util.List;

import com.synergisticit.domain.User;

public interface UserService {
	
	User SaveUser(User user);
	User findUserByID(Long userId);
	void delteUserByID(Long userId);
	List<User> findUsers();

}
