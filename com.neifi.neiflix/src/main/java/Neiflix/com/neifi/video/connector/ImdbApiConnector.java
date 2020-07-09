package Neiflix.com.neifi.video.connector;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Controller
public abstract class ImdbApiConnector implements Connector{
	
	private OkHttpClient http = new  OkHttpClient();
	private Request getVideoContent;
	private String url = "https://imdb8.p.rapidapi.com/title/get-top-stripe";
	private String id = "\\?tconst=tt0944947\\";
	
	
	
	@Override
	
	public void connect() {

		Request request = new Request.Builder()
				.url("https://imdb8.p.rapidapi.com/title/get-top-rated-movies")
				.get()
				.addHeader("x-rapidapi-host", "imdb8.p.rapidapi.com")
				.addHeader("x-rapidapi-key", "a1c9ef7080mshc8c626b0040fb38p134702jsncf16fd3b07db")
				.build();

			try {
				Response response = http.newCall(request).execute();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	
}
