package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		// List is an interface - we cannot create an object of
		// What are the classes that implement it?
		// - ArrayList
		// - LinkedList
		
		List<String> list = new ArrayList();
		
		list.add("Burak");
		list.add("Aslı");
		list.add("Ballito");
		list.add("Bitli Büşra");
		
		System.out.println(list);
		
		for(String str: list) {
			
			System.out.println(str);
		}

	}

}
