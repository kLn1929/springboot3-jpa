package com.kln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kln.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
