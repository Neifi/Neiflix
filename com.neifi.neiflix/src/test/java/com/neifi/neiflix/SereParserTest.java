package com.neifi.neiflix;

import static org.junit.Assert.*;

import org.junit.Test;

import Neiflix.com.neifi.video.parser.JsonToSerieParser;
import Neiflix.com.neifi.video.serie.Serie;

public class SereParserTest {

	@Test
	public final void ReciveJSONExtractCorrectData() {
		JsonToSerieParser json = new JsonToSerieParser();
		String actual = json.parse("");
		String expected ="{\"title\":{\"titleType\":\"tvSeries\",\"image\":\"aHR0cHM6Ly9tLm1lZGlhLWFtYXpvbi5jb20vaW1hZ2VzL00vTVY1QllUUmlORFF3WXpBdE16VmxaUzAwTlRJNUxXSmpZalV0TXprd05UVXpNV014WlRsbFhrRXlYa0ZxY0dkZVFYVnlOREl6TXpjd05qY0AuX1YxXy5qcGc=\",\"year\":2011,\"id\":\"\\/title\\/tt0944947\\/\",\"title\":\"Game of Thrones\"}}";
		assertEquals(expected, actual);
	}
	
	@Test
	public final void ReciveParsedJSONMapToSerieEntity() {
		JsonToSerieParser json = new JsonToSerieParser();
		String actual = "";
		Serie expected = new Serie();
	}
}
