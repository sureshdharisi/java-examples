package com.poc.java8.functional.interfaces.test;

import com.poc.java8.functional.interfaces.IntFunction;

public class IntFunctionTest {

	static IntFunction func= a->System.out.println("Value = "+a);
	
	public static void main(String[] args) {
		func.printValue(10);
	}
}
