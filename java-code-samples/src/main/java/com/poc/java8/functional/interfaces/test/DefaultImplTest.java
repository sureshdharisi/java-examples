package com.poc.java8.functional.interfaces.test;

import com.poc.java8.functional.interfaces.DefaultIntf;
import com.poc.java8.functional.interfaces.impl.DefaultIntfImpl;

public class DefaultImplTest implements DefaultIntf{

	public static void main(String[] args) {
		DefaultImplTest impl1=new DefaultImplTest();
		
		impl1.m1();
		
		DefaultIntfImpl impl2=new DefaultIntfImpl();
		impl2.m1();
		
		DefaultIntf impl3=new DefaultIntfImpl();
		impl3.m1();
		
	}
}
