package repeat.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        // driver.navigate().to("") methodunu sayfada ileri geri yapilacaksa kullanilir
        // driver.get() methodu gibi bizi istedigimiz URL'e goturur
        driver.navigate().to("https://www.techproeducation.com");
        // Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();
        // Tekrar techproeducation sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().forward();
        // TechProed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        // Syfayi kapatin
        driver.close();

    }
}
