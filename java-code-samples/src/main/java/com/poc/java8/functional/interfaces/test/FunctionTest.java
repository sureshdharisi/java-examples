package com.poc.java8.functional.interfaces.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		System.out.println(getLengthFunc().apply("Suresh"));
		
		removeEmptySpaces("Welcome to Java 8");
		printNumberOfSpaces("Welcome to Java 8");
		printNumberOfSpaces("Welcome  to  Java 8");
		
		printSubString("Welcome Pensylvania");
	}
	
	public static Function<String,Integer> getLengthFunc(){
		return (String s) -> s.length();
	}
	
	public static void removeEmptySpaces(String input) {
		Function<String, String> out=(String s)->s.replace(" ", "");
		
		System.out.println(out.apply(input));
	}
	
	public static void printNumberOfSpaces(String input) {
		Function<String, Integer> count = (String s)->s.split(" ").length;
		
		System.out.println("Number of spaces of "+input+" are = "+count.apply(input));
	}
	
	public static void printSubString(String input) {
		Function<String, String> f1=(s)->s.toUpperCase();
		Function<String,String> f2 = (s)->s.substring(0,5);
		System.out.println(f1.andThen(f2).apply(input));
	}
}
