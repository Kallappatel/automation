package com.Automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseclass {

	
		@Test
		public void method1() {
			System.out.println("method1 executed");
		}
		@Test
		public void method2() {
			System.out.println("method2 executed");
		}
		@Test
		public void methodtest3() {
			System.out.println("method1 executed");
		}
		@Test
		public void methodtest4() {
			System.out.println("method2 executed");
		}
		@BeforeTest
		public void method4() {
			System.out.println("method 4 executed");
		}
@AfterTest
public void method6() {
	System.out.println("method6 executed");
}
@BeforeClass
public void method7() {
	System.out.println("method7 executed");
	
}
@AfterClass
public void method8() {
	System.out.println("method8 executed");
}
@BeforeSuite
public void method9() {
	System.out.println("method9 executed");
}
@AfterSuite
public void method10() {
	System.out.println("method10 executed");
}
}

