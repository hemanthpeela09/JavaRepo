package com.poc.form;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Actor implements Serializable{
	private int aid;
	private String name;
	private Set<Movies> movies;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Movies> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movies> movies) {
		this.movies = movies;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
}
