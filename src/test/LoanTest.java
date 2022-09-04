package test;

import org.testng.annotations.Test;

@Test(groups = { "regression" })
public class LoanTest extends BaseClass {

	@Test(groups = { "sanity" }, enabled = true, description = "This wtest to validate home loan", priority = 1)
	public void HomeLoanTest() {

		System.out.println("Inside home loan test");

	}

	@Test(groups = { "regression" }, priority = 3)
	public void PersonalLoan() {

		System.out.println("Inside personal loan test");
	}

//Disable this specific method in running
	@Test(enabled = false, priority = 2)
	public void CarLoan() {

		System.out.println("Inside Car Loan");

	}

	@Test(priority = 0)
	public void PersonalLoan1() {

		System.out.println("Inside PersonalLoan1 ");

	}

//if we dont give any priority then it will first execute before priority is 0
	// if no priority then tests will execute depending on the name of methods on
	// ascending order
	@Test
	public void BusinessLoan() {

		System.out.println("Inside Business loan ");

	}
}
