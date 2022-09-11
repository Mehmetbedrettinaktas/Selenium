package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C07_FindeElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        // Amazon sayfasindaki tag'lari link(a) olanlarin sayisini yazdiriniz
        List<WebElement> tag =driver.findElements(By.tagName("a"));
        System.out.println("A taginin sayisi " +tag.size());

        // Amazon sayfasindaki tag'lari input olanlarin sayisini yazdiriniz
        List<WebElement> inputSayiyi =driver.findElements(By.tagName("input"));
        System.out.println("input taginin sayisi " +inputSayiyi.size());

    }
}
