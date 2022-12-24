package team03_Working;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class test01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // "https://www.sahibinden.com/" adresine gidin
        driver.get("https://www.sahibinden.com/");

        // Detaylı Arama  butonuna basiniz
        driver.findElement(By.xpath("//a[@title='Detaylı Arama']")).click();

        WebElement detayliAramaElementi =driver.findElement(By.xpath("//h2[text()='Detaylı Arama']"));
        if (detayliAramaElementi.isDisplayed()){
            System.out.println("PASSSED");
        }else {
            System.out.println("FAILED");
        }
        // Vasita butonuna click yapiniz
        driver.findElement(By.xpath("//span[text()='Vasıta']")).click();
        driver.findElement(By.xpath("//span[text()='Motosiklet']")).click();

        List<WebElement> motoList=driver.findElements(By.xpath("(//div[@class='category-list-wrapper'])[3]"));
        for (WebElement each:motoList) {
            System.out.println(each.getText());
        }



        Thread.sleep(1000);
        driver.close();
    }
}
