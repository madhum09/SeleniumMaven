package restAPI;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssetionsTest {

	
	@Test(dataProvider = "dataprovider")
	public void assertTest(String name,int id) {
		
		
		
		
		System.out.println("before soft");
		Assert.assertEquals("madhu", "madhu");
		//Assert.assertNotEquals("sdfas", "sdfas");
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals("madhu", "asfsfd");
		System.out.println("this is soft");
		
		Assert.assertTrue(true);
		System.out.println("after soft");
		
		sa.assertAll();
	}
	
	@DataProvider(name="dataprovider",indices={0,1})
	Object[][] loginData(){
			
		Object[][] data= {
					{"name","madhu"},
					{"id",123},
					{"name","virat"},
					{"id",111}
				
					};
		
		return data;
		
		
	}
	
}



