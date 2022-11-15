package com.webservice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
