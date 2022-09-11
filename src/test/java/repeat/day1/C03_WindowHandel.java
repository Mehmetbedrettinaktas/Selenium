package repeat.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle()); // hash code   CDwindow-EF30F7C1782BCD8E08EA0A214680FA7E
        // farkli pencereler arasinda gezinebilmek icin getWindowHandle methodunu kullaniriz.
    }
}
