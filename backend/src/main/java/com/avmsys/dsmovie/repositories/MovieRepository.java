package com.avmsys.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avmsys.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	
}
