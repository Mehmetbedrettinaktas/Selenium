package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath {
    /*

    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    Delete butonu’nun gorunur oldugunu test edin
    Delete tusuna basin
    “Add/Remove Elements” yazisinin gorunur oldugunu test edin

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
      //  driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // Delete butonu’nun gorunur oldugunu test edin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Delete']"));
        // Delete tusuna basin
        Thread.sleep(3000);
      WebElement deleteButonu= driver.findElement(By.xpath("//*[text()='Delete']"));
      if (deleteButonu.isDisplayed()){
          System.out.println("Delete TESTİ PASSED");
      }else System.out.println("Delete Testi FAILED");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveElements= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElements.isDisplayed()){
            System.out.println("AddRemoveElements TESTİ PASSED");
        }else System.out.println("AddRemoveElements Testi FAILED");
        driver.close();

    }
}
