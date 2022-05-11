package com.poc.java8.functional.interfaces;

public interface DefaultIntf {

	default void m1() {
		System.out.println("parent implementation");
	}
}
