package com.avmsys.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avmsys.dsmovie.dto.MovieDTO;
import com.avmsys.dsmovie.dto.ScoreDTO;
import com.avmsys.dsmovie.entities.Movie;
import com.avmsys.dsmovie.entities.Score;
import com.avmsys.dsmovie.entities.User;
import com.avmsys.dsmovie.repositories.MovieRepository;
import com.avmsys.dsmovie.repositories.ScoreRepository;
import com.avmsys.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByName(dto.getNome());
		if (user == null) {
			user = new User();
			user.setName(dto.getNome());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for(Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}

}
