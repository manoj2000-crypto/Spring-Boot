package com.lms.LaptopManagementSystem.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.LaptopManagementSystem.entity.User;
import com.lms.LaptopManagementSystem.repository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {

		this.userRepository.save(user);

	}

	public Optional<User> getUserByEmail(String email) {

		return this.userRepository.findByuserEmail(email);

	}
}