package com.poc.java8.functional.interfaces.test;

public class SupplierTest {

	public static void main(String[] args) {
		testRandomInteger();
	}
	
	public static void testRandomInteger() {
		System.out.println(Math.random());
		System.out.println((Math.random()*2));
		System.out.println((int)(Math.random()*2));
	}
}
