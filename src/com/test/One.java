package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class One {
	
	public static void main(String[] args) {
	
		
		 String str = "Muthuraja";

	        str = str.toLowerCase(); // case-insensitive

	        Map<Character, Integer> map = new LinkedHashMap<>();

	        // Count characters
	        for (char ch : str.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }

	        // Print repeated characters
	        System.out.println("Repeated characters:");
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
	            }
	            
	           System.out.println("Successfully Created");
	           
	           System.out.println("Issue was resolved");
	            
	            
	            
	        }
	    }

}