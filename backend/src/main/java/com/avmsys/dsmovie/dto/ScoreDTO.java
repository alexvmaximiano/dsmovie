package com.avmsys.dsmovie.dto;

public class ScoreDTO {

	private Long movieId;
	private String nome;
	private Double score;
	
	public ScoreDTO() {
	}
	public ScoreDTO(Long movieId, String nome, Double score) {
		this.movieId = movieId;
		this.nome = nome;
		this.score = score;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}

	
	
}
