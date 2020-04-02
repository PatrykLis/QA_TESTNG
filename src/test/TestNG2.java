package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {

	
	@Test
	public void Makro ()
	{
		System.out.println("Hello again");
	}
@BeforeTest  //that will be executeFIRST
public void prerequsted ()
{
System.out.println("It supposed be first");
}
}
