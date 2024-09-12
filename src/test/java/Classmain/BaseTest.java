package Classmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected WebDriver driver;

    // Method to initialize WebDriver for Chrome
    public WebDriver initChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        // Add any necessary Chrome options here
        // e.g., options.addArguments("--headless");

        try {
            return new RemoteWebDriver(new URL("http://aselenium-hub:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Selenium Grid URL", e);
        }
    }

    // Method to quit the WebDriver instance
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
