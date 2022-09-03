package test;


import org.testng.annotations.Test;


@Test(groups= {"regression"})
public class LoanTest extends BaseClass {


	//@Test(groups= {"sanity"})
	public void HomeLoanTest() {

		System.out.println("Inside home loan test");

	}

	//@Test(groups= {"regression"})
	public void PersonalLoan() {

		System.out.println("Inside personal loan test");
	}

	//@Test
	public void CarLoan() {

		System.out.println("Inside Car Loan");

	}

	

	@Test
	public void PersonalLoan1() {

		System.out.println("Inside PersonalLoan1 ");

	}

}
