package repeat.day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_MangeWindowSet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
     /*
        Yeni bir Class olusturalim.C04_ManageWindowSet
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin

      */
        //  Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //  Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //  Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(600,300));

        //  Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //  8. Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
