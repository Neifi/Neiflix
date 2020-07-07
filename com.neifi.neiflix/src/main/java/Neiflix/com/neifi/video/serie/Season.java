package Neiflix.com.neifi.video.serie;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Season {
	private String releaseDate;
	private int seasonNumber;
	private int numberOfEpisodes;
	private List<Episode> episodes;
}
