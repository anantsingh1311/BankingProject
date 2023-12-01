package com.synergisticit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.User;
import com.synergisticit.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User SaveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findUserByID(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			return user.get();
		}
		
		return null;
	}

	@Override
	public void delteUserByID(Long userId) {
		 userRepository.deleteById(userId);
	}

	@Override
	public List<User> findUsers() {
		return userRepository.findAll();
	}

}
