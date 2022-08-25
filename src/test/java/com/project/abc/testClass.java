package com.project.abc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class testClass {
	
	OperatingClass obj;
	
	@Before
	public void perfromBefore() {
		System.out.println("Calling Before...");
		obj = new OperatingClass();
	}

	@Test
	public void testCase1() {
		String expectedResult = "1st class";
		String obtainedResult = obj.logic(97);
		Assert.assertEquals(expectedResult, obtainedResult);
	}

	
	@Test
	public void testCase2() {
		String expectedResult = "2nd class";
		String obtainedResult = obj.logic(75);
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	
	@Test
	public void testCase3() {
		String expectedResult = "3rd class";
		String obtainedResult = obj.logic(44);
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	
	@Test
	public void testCase4() {
		String expectedResult = "fail";
		String obtainedResult = obj.logic(28);
		Assert.assertEquals(expectedResult, obtainedResult);
//		System.out.println(Assert.assertEquals(expectedResult, obtainedResult));
	}
	
	@After
	public void performingAfter() {
		System.out.println("Completed all test cases");
	}
	
	
}
