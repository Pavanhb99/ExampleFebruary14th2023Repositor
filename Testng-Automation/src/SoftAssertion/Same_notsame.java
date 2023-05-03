package SoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Same_notsame {
   public static SoftAssert obj=new SoftAssert();
   @Test
   public void assertsame()
   {
	   try
	   {
		   String s1="javaScript";
		   String s2=new String("javaScript");
		   obj.assertSame(s1, s2);
		   System.out.println("this line has execute after execution of assertsame step");
		   obj.assertAll();
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   @Test
   public void assertnotsame()
   {
	   try
	   {
		   String s1="javaScript";
		   String s2=new String("javaScriptnew");
		   obj.assertNotSame(s1, s2);
		   System.out.println("this line has execute after execution of assertnotsame step");
		   obj.assertAll();
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
