package com.neotech.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {

		List<Map<String, String>> listOfMaps = new ArrayList();
		
		Map<String, String> burak = new HashMap();
		
		burak.put("firstName", "Burak");
		burak.put("lastName", "Alay");
		
		
		listOfMaps.add(burak);
		
		System.out.println(listOfMaps);
		System.out.println(burak);
		
	
		
		
		
		
	}

}
