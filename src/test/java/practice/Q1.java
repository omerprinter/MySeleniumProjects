package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {

    //Exercise1...
  //  Create a new class under Q1 create main method
    public static void main(String[] args) throws InterruptedException {
        //  Set Path
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        //  Create chrome driver
        WebDriver driver=new ChromeDriver();
        //  Maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //  Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        Thread.sleep(1000);

        //  On the same class, Navigate to amazon home page https://www.amazon.com/

        //  Navigate back to google
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);
        //  Navigate forward to amazon
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        //  Refresh the page
        driver.navigate().refresh();
        Thread.sleep(1000);
        //  Close/Quit the browser
        driver.quit();
        //  And last step : print "All Ok" on console



    }


}
