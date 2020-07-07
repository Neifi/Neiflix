package Neiflix.com.neifi.video.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Movie implements Video{
	
	private String id;
	private String name;
	private String image;
	private String year;
	private Rate rate;
}
