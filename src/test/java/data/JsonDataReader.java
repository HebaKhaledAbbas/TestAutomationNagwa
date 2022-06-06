package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {

	public String SearchData ;

	public void JsonReader() throws FileNotFoundException, IOException, ParseException 

	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";

		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray)parser.parse(new FileReader(srcFile));

		for (Object jsonObj : jArray) 
		{
			JSONObject person = (JSONObject) jsonObj;
			SearchData = (String) person.get("addition");
			System.out.println(SearchData);

			
		}



	}

}
