package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Two {
	public static void main(String[] args) {
		int [] array = {2,3,4,5,6,2,3,4};
		
		HashSet<Integer> set = new HashSet<>();
		
		for (Integer integer : array) {
			
			if (!set.add(integer)) {
				
				System.out.print(integer);
				
			}
			
		}
	}
	
	
	

}
