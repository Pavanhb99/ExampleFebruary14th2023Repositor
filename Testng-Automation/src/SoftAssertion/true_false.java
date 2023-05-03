package SoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class true_false {
  public static SoftAssert obj=new SoftAssert();
  @Test
  public void assertTureDemo()
  {
	  try
	  {
		  int v1=25;
		  int v2=50;
		  obj.assertTrue(v2>v1);
		  System.out.println("this line has execute after execution of assertTure step");
		  obj.assertAll();
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  @Test
  public void assertfalseDemo()
  {
	  try
	  {
		  int v1=25;
		  int v2=50;
		  obj.assertFalse(v2<v1);
		  System.out.println("this line has execute after execution of assertfalse step");
		  obj.assertAll();
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
