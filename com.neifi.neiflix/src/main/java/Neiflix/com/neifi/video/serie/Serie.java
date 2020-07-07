package Neiflix.com.neifi.video.serie;

import java.util.List;

import Neiflix.com.neifi.video.movie.Movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Serie extends Movie{
	private List<Season> seasons;
	
	
}
