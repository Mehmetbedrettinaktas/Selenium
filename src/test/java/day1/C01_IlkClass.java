package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En Temel haliyle bir otomasyon yapmak icin class'imiza otomasyon
        icin gerekli olan webdriver'in yerini gostermemiz gerekir
        bunun icin java kutuphanesinde System.setProperty() method'unu kullaniriz
        ve method'un icine ilk olarak driver'i yazariz. Ikinci olarak onun fiziki
        yolunu kopyalariz.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Actual Title() = " + driver.getTitle()); // Gidinlen sitenin basligini yazdirir.
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // Gidinlen sayfanin Url'ini getirir.

        System.out.println(driver.getPageSource()); // Gidinlen sitenin kaynak kodlarini String olarak bize getirir.
    }
}
