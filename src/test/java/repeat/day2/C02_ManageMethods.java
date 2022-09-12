package repeat.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //  Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());// acilan browser'in konumunu verir
        System.out.println(driver.manage().window().getSize());//Acilan browser'in olculerini verir
        // Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); // Pencereyi simge durumuna getirir
        // simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        // Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni Pencere konumu"+ driver.manage().window().getPosition());
        System.out.println("Yeni pencere olculeri "+driver.manage().window().getSize());
        // Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        // Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen Pencere konumu"+ driver.manage().window().getPosition());
        System.out.println("Fullscreen pencere olculeri "+driver.manage().window().getSize());
        // Sayfayi kapatin
        driver.close();
    }
}
