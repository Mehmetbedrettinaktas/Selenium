package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {
        /*
        Yeni bir Class olusturalim.C04_ManageWindowSet
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu: "+ driver.manage().window().getPosition());
        System.out.println ("Sayfanin boyutlari: "+ driver.manage().window().getSize());

        // Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20)); // Sayfanin konumunu istedigimiz sekilde ayarlar
        driver.manage().window().setSize(new Dimension(600,300));// Sayfanin olculerini istedigimiz sekilde ayarlar

        // Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin yeni konumu: "+ driver.manage().window().getPosition());
        System.out.println ("Sayfanin yeni boyutlari: "+ driver.manage().window().getSize());
        Thread.sleep(3000);

        //   8. Sayfayi kapatin
        driver.close();


    }
}
