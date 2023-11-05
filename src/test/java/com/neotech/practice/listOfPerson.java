package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class listOfPerson {

	public static void main(String[] args) {
		
		List<Person> listOfPeople = new ArrayList();
		
		listOfPeople.add(new Person("Burak", 27));
		listOfPeople.add(new Person("Aslı", 25));
		listOfPeople.add(new Person("Ballito", 3));
		
		
		System.out.println(listOfPeople);
		
		for(Person p : listOfPeople) {
			
			System.out.println(p);
		}
		
		
	}

}

class Person {
	
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		
		
		this.name=name;
		this.age=age;
		
	}
	
	public String toString() {
		
		return name+" : "+age;
		
	}
	
	
}
