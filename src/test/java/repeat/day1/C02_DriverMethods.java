package repeat.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //  Ziyaret ettigimiz sayfayi maximum hale getirir.

        // Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        // kaynak kodlarinin icinde  "Gateway" kelimesinin oldugunu test ediniz
        //  System.out.println(driver.getPageSource()); // Sayfadaki kaynak kodlarini verir
        String arananKelime = "Gateway";
        if (driver.getPageSource().contains(arananKelime)) {
            System.out.println("PageSourse testi PASSED");
        } else System.out.println("PageSourse testi FAILED");

        driver.close(); // sayfayi kapatir
        // driver.quit();// birden fazla sayfa varsa hepsini kapatir
    }
}
