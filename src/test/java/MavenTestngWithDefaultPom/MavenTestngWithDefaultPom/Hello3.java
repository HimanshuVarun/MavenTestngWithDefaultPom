package MavenTestngWithDefaultPom.MavenTestngWithDefaultPom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hello3 
{
	@BeforeTest
	public void testBefore()
	{
		System.out.println("Hello innnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn DefaultPom");
	}
	@Test
	public void secoundTest()
	{
		System.out.println("Hiiiii innnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn DefaultPom");

	}

}
