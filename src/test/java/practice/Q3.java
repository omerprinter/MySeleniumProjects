package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //  go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();
        driver.findElement(By.id("ez-accept-all")).click(); // locate aldik

        //  fill the firstname
        driver.findElement(By.name("firstname")).sendKeys("Hikmet"+ Keys.ENTER);

        //  fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akyol"+Keys.ENTER);
        //  check the gender
        WebElement genderRadioButton=driver.findElement(By.id("sex-0"));
        genderRadioButton.click();
        genderRadioButton.sendKeys(Keys.PAGE_DOWN);
        //  check the experience
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
        //  fill the date
        driver.findElement(By.id("datepicker")).sendKeys("24.12.2022"+Keys.ENTER);
        //  choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();
        //  choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();
        //  choose your continent -> Europa
        driver.findElement(By.id("continents")).sendKeys("Europa"+Keys.ENTER);
        //  choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        //  click submit button
        driver.findElement(By.id("submit")).click();



    }




}
