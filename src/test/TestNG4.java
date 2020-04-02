package test;

import org.testng.annotations.Test;

public class TestNG4 {

	@Test(groups= {"smoke"})
	public void WebloginHomeLoan ()
	{
		//selenium
		System.out.println("weblogincar");
	}
	@Test	
	public void MobileLoginHomeLoan ()
	{
		//Apium
		System.out.println("mobilelogincar");
	}
	
	@Test(groups= {"smoke"})
	public void LoginAPIHomeLoan ()
	{
		
		//Rest APi Automation
		System.out.println("APIlogincar");
	}
}
