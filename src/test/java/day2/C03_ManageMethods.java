package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    /*
         Yeni bir Class olusturalim.C03_ManageWindow
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfayi simge durumuna getirin
        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Sayfayi fullscreen yapin
        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Sayfayi kapatin
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.amazon.com"); // bir adrese biti goturen  kod blogu
        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere konumu "+ driver.manage().window().getPosition());// acilan browse'in konumunu verir
        System.out.println("Pencere olculerini verir"+ driver.manage().window().getSize());// Acilan browse'in olculerini verir
        // sayfanin simge durumuna getirin
        driver.manage().window().minimize(); // Pencereyi simge durumuna getirir
        // simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
       // Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni Pencere konumu "+ driver.manage().window().getPosition());
        System.out.println(" Yeni Pencere olculerini verir"+ driver.manage().window().getSize());
        Thread.sleep(3000);
        // Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen Pencere konumu "+ driver.manage().window().getPosition());
        System.out.println(" Fullscreen Pencere olculerini verir"+ driver.manage().window().getSize());
        Thread.sleep(3000);
        // Sayfayi kapatin
        driver.close();

    }
}
