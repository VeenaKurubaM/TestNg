package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	// for jira connectivities
	@BeforeTest(alwaysRun=true)
	public void method3() {

		System.out.println("Inside Before Test");
	}

	// for ech method prereqsites , like db openings
	@BeforeMethod(alwaysRun=true)
	public void method1() {

		System.out.println("Inside Before Method");
	}

	@AfterMethod(alwaysRun=true)
	public void method2() {

		System.out.println("Inside After Method");
	}

	@AfterTest(alwaysRun=true)
	public void method4() {
	

		System.out.println("Inside after Test");
	}
}
