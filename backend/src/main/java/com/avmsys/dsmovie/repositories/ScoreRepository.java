package com.avmsys.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avmsys.dsmovie.entities.Score;
import com.avmsys.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
}
