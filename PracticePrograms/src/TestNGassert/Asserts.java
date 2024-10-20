package TestNGassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {

	@Test
public void sample1() {
		
		String str1 = "Hello";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(str1, "Hi");    // fail
		System.out.println(str1);
		
		String str2 = "Hi";
		soft.assertEquals(str2, "Hi");
		System.out.println(str2);
	}
	
	@Test
	public void sample2() {
		System.out.println("Automation");
	}

}
