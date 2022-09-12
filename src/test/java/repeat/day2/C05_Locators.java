package repeat.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Amazonda nutella aratınız
      // WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
     //  aramaKutusu.sendKeys("Nutella" + Keys.ENTER); // Bu sekilde arama yaptigimizda amazon sayfasinda
        // Nutellayi aratiyoruz ve kilickliyor
        driver.findElement(By.linkText("Become an Affiliate")).click();

        //sayfayi kapatin
       driver.close();
    }
}
