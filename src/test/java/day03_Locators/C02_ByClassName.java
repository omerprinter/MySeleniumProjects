package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        List<WebElement> fiyatlarListesi=driver.findElements(By.className("a-price-whole"));

        // web element direk yazdirilamaz
        System.out.println(fiyatlarListesi);

        // foreach ile tek tek yazdirmaliyiz
        for (WebElement each:fiyatlarListesi) {
            System.out.print(each.getText()+" "); //12 39 45 11 26 34 52 11 12 11 12 8 9 12 6 5 9 12 12 24 29 18 13
        }
        /*en yuksek fıyatı bulabılmek ıcın java bılgımızı kullanmalıyız.
    1 - web elementlerden getText ıle fıyatı strıng olarak alın
    2- Strıng fiyatı kıyaslama yapabılmek için Integer'a çevirin
    3- en yuksek fıyatı bulup yazdırın*/
        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;
        for (WebElement each:fiyatlarListesi) {
            fiyatStr=each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);

            if (fiyatInt>enYuksekFiyat){
                enYuksekFiyat=fiyatInt;
            }

        }
        System.out.println("");
        System.out.println("En yuksek fiyat : "+enYuksekFiyat );// En yuksek fiyat : 52



        Thread.sleep(1000);
        driver.close();
    }
}
