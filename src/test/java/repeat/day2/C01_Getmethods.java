package repeat.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Getmethods {
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
        driver.manage().window().maximize();

        //  Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //  Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi " +driver.getTitle());
        //  Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        //  Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i " +driver.getCurrentUrl());
        //  Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl= driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");
        //  Sayfa handle degerini yazdirin
        System.out.println("Handel degeri " +driver.getWindowHandle());
        //  Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource= driver.getPageSource();
        String htmlAranankelime="Gateway";
        if (actualPageSource.contains(htmlAranankelime)){
            System.out.println("Sourcecode Testi PASSED");
        }else System.out.println("Sourcecode testi FAILED");
        //  Sayfayi kapatin.
        driver.close();
    }
}
