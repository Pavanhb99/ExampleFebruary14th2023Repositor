package SoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EqualAndNotEqual {
	 public static SoftAssert obj=new SoftAssert();
	  @Test
	  public void assertEqualDemo()
	  {
		  try
		  {
			  String s1="javaScript";
			  String s2=new String("javaScript");
			  obj.assertEquals(s1, s2);
			  System.out.println("this line has execute after execution of assertEqual step");
			  obj.assertAll();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  @Test
	  public void assertNotEqualDemo()
	  {
		  try
		  {
			  String s1="javaScript";
			  String s2=new String("javaScriptnew");
			  obj.assertNotEquals(s1, s2);
			  System.out.println("this line has execute after execution of assertNotEqual step");
			  obj.assertAll();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
     
}
