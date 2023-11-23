package com.project.sitefilmes.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.sitefilmes.model.User;

@Service
public interface UserService {

	User authenticate(String email, String password);

	User save(User user);

	void delete(User user);

	void validateEmail(String email);

	Optional<User> getById(Long id);

}
