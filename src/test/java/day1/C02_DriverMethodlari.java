package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // browserda acilan sayfayi tam sayfa acmak icin bu kodlari yaziyoruz

        //  amazon sayfasinina gidiniz
        driver.get("https://www.amazon.com");
        // Kaynak kodlarin icinde "Gateway" kelimesinin oldugunu test ediniz.
        System.out.println(driver.getPageSource()); // Gidilen sayfanin kaynak kodlarini verir
        String istenenKelime= "Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi PASSED");
        }else System.out.println("PageSourse testi FAILED");
        driver.close(); // sayfayi kapatiyor
       // driver.quit(); birden fazla sayfa varsa hepsini kapatir.
    }
}
