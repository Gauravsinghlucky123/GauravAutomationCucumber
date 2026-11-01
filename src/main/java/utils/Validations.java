package utils;

import org.testng.Assert;

public class Validations {

	public void test2() {
		System.out.println("step1");
		Assert.assertEquals(2, 3, "Assert fail and value is not equl");
		System.out.println("step2");
		
		Assert.assertTrue(false);
		System.out.println("step3");
	}
	

	
}
