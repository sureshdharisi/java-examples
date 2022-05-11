package com.poc.java8.functional.interfaces.test;

import java.util.Arrays;
import java.util.List;

import com.poc.java8.functional.interfaces.dto.Student;

public class SortTest {

	public static void main(String[] args) {
		List<Student> stdList=Arrays.asList(new Student(10, "Suresh"),new Student(5, "Dharisi"),new Student(8, "Venkata"));
		stdList.stream().sorted((std1,std2)->std1.getId().compareTo(std2.getId())).forEach(System.out::println);
		
	}
}
