package SoftAssertion;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Null_Notnull {
   public SoftAssert obj=new SoftAssert();
   @Test
   public void assertnull()
   {
	   try
		  {
			  File f1=null;
			  obj.assertNull(f1);
			  System.out.println("this line has execute after execution of assertnull step");
			  obj.assertAll();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
   }
   @Test
   public void assertnotnull()
   {
	   try
		  {
			  File f1=null;
			  f1=new File("D:\\EXCEL");
			  obj.assertNotNull(f1);
			  System.out.println("this line has execute after execution of assertnotnull step");
			  obj.assertAll();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
   }
}
