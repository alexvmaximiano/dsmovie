package com.avmsys.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avmsys.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
}
