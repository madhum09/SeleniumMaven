package restAPI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Classmain.BaseTest;

public class RemoteWebDriverTest extends BaseTest {

    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        // Initialize WebDriver based on the parameter
        if ("chrome".equalsIgnoreCase(browser)) {
            driver = initChromeDriver();
        
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    @Test
    public void testGoogleSearch() {
        try {
            // Open Google and check the title
            driver.get("https://www.google.com");
            String pageTitle = driver.getTitle();
            System.out.println("Page title is: " + pageTitle);
            // Add assertions here to verify the test results
        } catch (Exception e) {
            e.printStackTrace();
            throw e; // Rethrow exception to fail the test
        }
    }

    @AfterClass
    public void tearDown() {
        quitDriver();
    }
}
