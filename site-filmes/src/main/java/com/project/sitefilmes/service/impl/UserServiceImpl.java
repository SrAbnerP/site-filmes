package com.project.sitefilmes.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.sitefilmes.model.User;
import com.project.sitefilmes.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User authenticate(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validateEmail(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<User> getToId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
