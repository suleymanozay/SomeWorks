package com.sample;

import java.util.Collection;
import java.util.List;
import java.util.Map;





public class DbSteps extends DbUtils{
	
	public static void main(String[] args) {
		
		createConnection();
		String sqlQuery = "select * from ACCOUNT;";
		
		List<Map<String, String>> list = storeDataFromDB(sqlQuery);
		
		for (Map<String, String> map : list) {
			Collection<String> val = map.values();
			for (String map2 : val) {
				System.out.println(map2);
		}

		}

		closeResources();

		
		
	}

}
