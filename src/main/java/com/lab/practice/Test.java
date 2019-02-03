package com.lab.practice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException {

		String str = "{\"filters\":[{\"attribute\":\"note\",\"operator\":\"eq\", \"value\":\"Conversion\"}]}";

		JSONParser parser = new JSONParser();
		
		JSONObject json = (JSONObject) parser.parse(str);
		
		JSONArray arry = (JSONArray)json.get("filters");
		
		JSONObject jsonObj = (JSONObject)arry.get(0);
		
		System.out.println(jsonObj.get("attribute"));
		System.out.println(jsonObj.get("operator"));
		System.out.println(jsonObj.get("value"));
		
	}

}
