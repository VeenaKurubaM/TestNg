package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass{
	@Test(groups= {"sanity"})
	public void CreditCardTest() {
		System.out.println("Inside Credit Card test");

	}
	@Test(groups= {"sanity","regression"})
	public void DebitCardTest() {
		System.out.println("Inside Debit Card test");

	}
}
