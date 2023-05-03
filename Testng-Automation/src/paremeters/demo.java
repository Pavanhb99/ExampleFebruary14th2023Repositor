package paremeters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {
	@Parameters(value="username")
	@Test
	public void createusers(String username)
	{
	  System.out.println("this users"+username+"has created successfully");
	}
}
