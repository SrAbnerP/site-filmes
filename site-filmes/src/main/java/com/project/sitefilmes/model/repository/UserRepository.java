package com.project.sitefilmes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sitefilmes.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
