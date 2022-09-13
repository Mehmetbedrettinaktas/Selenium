package generalRepeat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_DriverGetMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //Sayfanin basligini(title) yazdirin
        System.out.println(driver.getTitle()); // Amazon.com. Spend less. Smile more.

        //Sayfanin basliginin "Amazon" icerdigini tesbit edin
       String actualTitle= driver.getTitle();
       String ararnanKelime="Amazon";
       if (actualTitle.contains(ararnanKelime)){
           System.out.println("Title testi PASSED"); // Title testi PASSED
       }else System.out.println("Title testi FAILED");

        //  3- url'in "https://www.amazon.com" 'a esit oldugunu test edin
        String actualUrl=driver.getCurrentUrl();
        String sorgulananUrl="https://www.amazon.com";
        if (actualUrl.equals(sorgulananUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED"); // Url testi FAILED  --> https://www.amazon.com/
        System.out.println(driver.getCurrentUrl());


        // sayfayi kapatin
        driver.close();

    }
}
