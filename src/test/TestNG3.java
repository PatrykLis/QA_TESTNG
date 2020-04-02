package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG3 {
@BeforeClass
public void befoclas()
{
	System.out.println("Headache");
	
}
	
	@Test(groups= {"smoke"})
	public void MobileloginCarLoan ()
	{
		
		System.out.println("weblogincar");
	}
	@Test(enabled=true)
	public void AMobileloginCarLoan ()
	{
		
		System.out.println("weblogoutcar");
	}
	@BeforeMethod
	public void methody ()
	{
	System.out.println("FirstRun");
	}
	@AfterMethod
	public void methodys ()
	{
	System.out.println("LastRun");
	}
	@Parameters({"URL","APIKey/username"}) //to dotyczy XML
	@Test
	public void AMobileLoginCarLoan (String urlname, String key)
	{
		//Apium
		System.out.println("Mobilelogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(dependsOnMethods= {"MobileloginCarLoan","AMobileLoginCarLoan"})	
	public void MobileAPIcarLoan ()
	{
		
		//Rest APi Automation
		System.out.println("APIlogincar");
	}
	@BeforeSuite
	public void gramatura ()
{
		System.out.println("Train");
}
	
	@Test(dataProvider="getData")
	public void credentials(String username, String password)  //jak dajesz jakies info i musisz je zwrocic musisz dac String
	{
		System.out.println("CREDENTIALISEN");
		System.out.println(username);
		System.out.println(password);
	}
	
@DataProvider	
		public Object[][] getData()
		{
						//1st combination - 1 user (name and password) good =row
			//2nd user medium (name and password)
			//3rd user  bad (name and password)
	Object[][] data=new Object[3][2];
	//1ST combination
	data[0][0]="FirstSetUsername"; //0 stands for zero index 
	data[0][1]="1password"; 
	//columns in the row are nothings but values for particular combination (row)
	//2ND combination
	data[1][0]="SecondSetUsername";
	data[1][1]="2password";
	//3RD Combination
	data[2][0]="ThirdSetUsername";
	data[2][1]="3password";
		return data;
		
		}
}
