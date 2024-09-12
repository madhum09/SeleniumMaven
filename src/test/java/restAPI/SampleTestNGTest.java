package restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNGTest {
	
	@Test
	public void openURL() {
		
		System.out.println("this is open url testng sample");
		Assert.assertTrue(true);;
	}

	@Test
	public void OnWebPage() {
		
		System.out.println("this is web page testng sample");
		Assert.assertTrue(true);;
	}
	
	@Test
	public void ClosePage() {
	
	System.out.println("this is close url testng sample");
	Assert.assertTrue(true);;
}
	
}
