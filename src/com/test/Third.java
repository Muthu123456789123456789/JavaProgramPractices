package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Third {
	
	public static void main(String[] args) {
		
		 String str = "Muthuraja";
		 
		 char[] charArray = str.toCharArray();

	        str = str.toLowerCase(); // case-insensitive

	        Map<Character, Integer> map = new LinkedHashMap<>();

	        // Count characters
	        for (char ch : charArray) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }

	        // Print repeated characters
	        System.out.println("Repeated characters:");
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
	            }
	        }
	    }
		
}

