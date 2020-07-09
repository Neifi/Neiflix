package Neiflix.com.neifi;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/")
    String hello() {
    	OkHttpClient http = new  OkHttpClient();

    	Request request = new Request.Builder()
				.url("https://imdb8.p.rapidapi.com/title/get-top-rated-movies")
				.get()
				.addHeader("x-rapidapi-host", "imdb8.p.rapidapi.com")
				.addHeader("x-rapidapi-key", "a1c9ef7080mshc8c626b0040fb38p134702jsncf16fd3b07db")
				.build();

			try {
				Response response = http.newCall(request).execute();
				
				return response.body().string();
			} catch (IOException e) {
				e.printStackTrace();
			}
        return "Hello World!";
    }
}