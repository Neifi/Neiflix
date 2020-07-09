package Neiflix.com.neifi.video.service;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import Neiflix.com.neifi.video.connector.Connector;
import Neiflix.com.neifi.video.connector.ImdbApiConnector;
import Neiflix.com.neifi.video.movie.Movie;
import Neiflix.com.neifi.video.parser.JsonToMovieParser;
import Neiflix.com.neifi.video.parser.JsonToSerieParser;
import Neiflix.com.neifi.video.parser.Parser;
import Neiflix.com.neifi.video.serie.Serie;

public class VideoService extends ImdbApiConnector{
	
	static VideoService instance;
	private HashMap<String, Movie> movieList;
	private HashMap<String, Movie> serieList;
	
	private Parser<Movie> movieParser;
	private Parser<Serie> serieParser;
	
	private Connector imdbConnector;
	
	private VideoService() {
		movieParser = new JsonToMovieParser();
		serieParser = new JsonToSerieParser();
		
		serieParser.parse("");
	}
	
	
	
	public static VideoService getInstance() {
		if(instance == null) {
			instance = new VideoService();			
			return instance; 
		}
		return instance;
	}
	
	
	

	
}
