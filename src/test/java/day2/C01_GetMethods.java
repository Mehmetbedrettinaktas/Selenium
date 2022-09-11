package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_GetMethods {
    public static void main(String[] args) {
        /*
            Yeni bir package olusturalim : day02
            Yeni bir class olusturalim : C01_GetMethods
            Amazon sayfasina gidelim. https://www.amazon.com/
            Sayfa basligini(title) yazdirin
            Sayfa basliginin “Amazon” icerdigini test edin
            Sayfa adresini(url) yazdirin
            Sayfa url’inin “amazon” icerdigini test edin.
            Sayfa handle degerini yazdirin
            Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
            Sayfayi kapatin.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // driver yonet sayfayi maxsimum genislik
        driver.get("https://www.amazon.com");
        //  2- Basligin "Amazon" icerdigini test ediniz
        System.out.println("Sayfa Title() = " + driver.getTitle());
        String actualTitle=driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

        // 3- URL'nin amazon icerdigini test ediniz
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // driver.getCurrentUrl() = https://www.amazon.com/
        String actualUrl= driver.getCurrentUrl();
        String arananKelime= driver.getCurrentUrl();
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        // farkli pencereler arasinda gezinebilmek icin getWindowHandle
        System.out.println(driver.getWindowHandle());
        // Kaynak kodlarin icinde "Gateway" kelimesinin oldugunu test ediniz.
        System.out.println("Handle degeri "+driver.getPageSource()); // Gidilen sayfanin kaynak kodlarini verir
        String htmlAranankelime= "Gateway";
        if (driver.getPageSource().contains(htmlAranankelime)){
            System.out.println("PageSourse testi PASSED");
        }else System.out.println("PageSourse testi FAILED");
        driver.close();
    }
}
