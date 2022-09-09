package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandel {
    public static void main(String[] args) {
        System.setProperty("webdriver.com.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // her arama yaptigimizda bu kodun yazilmasi lazim
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());
        // farkli pencereler arasinda gezinebilmek icin getWindowHandle
    }
}
