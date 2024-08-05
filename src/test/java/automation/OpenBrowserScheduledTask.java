package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class OpenBrowserScheduledTask {

    public static void main(String[] args) {
             
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
     
        Runnable task = new Runnable() {
            @Override
            public void run() {
                
                WebDriver driver = new EdgeDriver();

                driver.get("https://www.google.co.in/"); 
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                driver.quit();
            }
        };
        
        scheduler.scheduleAtFixedRate(task, 0, 15, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}
