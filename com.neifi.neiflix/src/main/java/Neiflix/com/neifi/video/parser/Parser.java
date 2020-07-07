package Neiflix.com.neifi.video.parser;

public interface Parser <T>{
	public T parse(String json);
}
