package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("maximize window boyutlari :"+driver.manage().window().getSize());
        System.out.println("maximize window konum :"+driver.manage().window().getPosition());


        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutlari :"+driver.manage().window().getSize());
        System.out.println("fullscreen window konum :"+driver.manage().window().getPosition());

        //Browser'i istedigimiz konumlara getirelim
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));

        Thread.sleep(2000);
        driver.close();


    }
}
