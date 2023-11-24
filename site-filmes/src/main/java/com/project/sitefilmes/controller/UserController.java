package com.project.sitefilmes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.sitefilmes.exception.AuthenticateError;
import com.project.sitefilmes.exception.BusinessRuleException;
import com.project.sitefilmes.model.User;
import com.project.sitefilmes.model.dto.UserDTO;
import com.project.sitefilmes.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/autenticar")
	public ResponseEntity<?> authenticate(@RequestBody UserDTO dto) {
		try {
			User userAuth = service.authenticate(dto.getEmail(), dto.getPassword());
			return ResponseEntity.ok(userAuth);
		} catch (AuthenticateError e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody UserDTO dto) {
		User user = new User(dto.getName(), dto.getEmail(), dto.getPassword());

		try {
			User saveUser = service.save(user);
			return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
		} catch (BusinessRuleException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody UserDTO dto) {
		return service.getById(id).map(findUser -> {
			try {
				User user = new User(id, dto.getName(), dto.getEmail(), dto.getPassword());
				return ResponseEntity.ok(service.update(user));
			} catch (BusinessRuleException e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}).orElseGet(() -> new ResponseEntity<>("Comentarío não encontrado na base de dados", HttpStatus.BAD_REQUEST));
	}

}
