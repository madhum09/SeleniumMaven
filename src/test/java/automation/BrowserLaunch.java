package automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		String title=driver.getTitle();
		
		if(title.equals("Your Store")) {
			System.out.println("test case is passed");
		}else {
			System.out.println("test case failed");
		}
		
		
	}

}
