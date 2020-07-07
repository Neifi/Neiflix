package Neiflix.com.neifi.video.service;

import java.util.HashMap;

import Neiflix.com.neifi.video.movie.Movie;
import Neiflix.com.neifi.video.parser.JsonToMovieParser;
import Neiflix.com.neifi.video.parser.JsonToSerieParser;
import Neiflix.com.neifi.video.parser.Parser;

public class VideoService {
	
	static VideoService instance;
	private HashMap<String, Movie> movieList;
	private HashMap<String, Movie> serieList;
	
	private Parser movieParser;
	private Parser serieParser;
	
	
	private VideoService() {
		movieParser = new JsonToMovieParser();
		serieParser = new JsonToSerieParser();
	}
	
	
	public static VideoService getInstance() {
		if(instance == null) {
			instance = new VideoService();
			return instance; 
		}
		return instance;
	}
	
	
	

	
}
