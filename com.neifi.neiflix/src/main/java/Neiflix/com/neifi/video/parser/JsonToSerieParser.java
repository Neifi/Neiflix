package Neiflix.com.neifi.video.parser;

import java.io.FileReader;
import java.io.FileWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import Neiflix.com.neifi.video.serie.Serie;

public class JsonToSerieParser extends JsonVideoParser {

	private JSONParser jsonParser = new JSONParser();

	@Override
	public String parse(String json) {

		try (FileReader reader = new FileReader(
				"/Users/Neifi/git/repository/com.neifi.neiflix/src/test/resources/got.json")) {
			Object obj = jsonParser.parse(reader);

			JSONObject serie = (JSONObject) obj;
			
			serie.remove("videoProducts");
			serie.remove("showtimes");
			Map title = (Map<String,Object>) serie.get("title");
			Map image = (Map) title.get("image");
			title.remove("@type");
			
			String url = (String)image.get("url");
			title.remove("image");
			title.put("image", Base64Coder.encodeString(url));
			
			parseToEntity(serie);

			return serie.toJSONString();

		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return " ";
	}
	
	private Serie parseToEntity(JSONObject json) {
		/**
		 * {"title":{"titleType":"tvSeries",
		 * "image":"aHR0cHM6Ly9tLm1lZGlhLWFtYXpvbi5jb20vaW1hZ2VzL00vTVY1QllUUmlORFF3WXpBdE16VmxaUzAwTlRJNUxXSmpZalV0TXprd05UVXpNV014WlRsbFhrRXlYa0ZxY0dkZVFYVnlOREl6TXpjd05qY0AuX1YxXy5qcGc=",
		 * "year":2011,
		 * "id":"\/title\/tt0944947\/",
		 * "title":"Game of Thrones"}}
		 */
		Map title = (Map<String,Object>) json.get("title");

		String id = json.get("id").toString().split("\\/")[3];
		System.out.println(id);
		return null;
	}

}
