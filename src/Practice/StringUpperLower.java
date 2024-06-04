package Practice;

import java.util.Arrays;
import java.util.List;

//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

public class StringUpperLower {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Green","Blue","Red","Yellow","Green");
		System.out.println("Oraginal List Elements");
		li.forEach(i->System.out.println(i));
		
		System.out.println("Lower Case Elements");
		
		li.forEach(i->System.out.println(i.toLowerCase()));
		
		System.out.println("Upper Case Elemets:");
		
		li.forEach(str->System.out.println(str.toUpperCase()));
		
	}

}
