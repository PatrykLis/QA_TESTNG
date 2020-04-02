package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;

public class TestNG1 {
	@Test //teraz dzia³amy sobie na TESTNG nie na java. 1 Test
	
	public void Demo () 
		{
System.out.println("I am the first one"); //automation
		}
	@Test(groups= {"smoke"}) //teraz Test 2 
	public void Demo2 () 
	{
		System.out.println("I am the second one");
		Assert.assertTrue(false);
		
	}
	@AfterSuite
	public void Demos()
	{
		System.out.println("I should be on end");
	}
}
