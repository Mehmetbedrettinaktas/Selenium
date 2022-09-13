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
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
      //  driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // Delete butonu’nun gorunur oldugunu test edin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='added-manually']"));
        // (//*[@class='added-manually'] )[1] eger birden fazla deger varsa [istenen index] numarasi yazilir


        Thread.sleep(3000);
        //  WebElement deleteButonu= driver.findElement(By.xpath("//*[@class='added-manually']")); // class ile
      WebElement deleteButonu= driver.findElement(By.xpath("//*[text()='Add Element']")); // text ile

      if (deleteButonu.isDisplayed()){
          System.out.println("Delete TESTİ PASSED");
      }else System.out.println("Delete Testi FAILED");
        // Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        /*
        Locate alirken sadece text kullanilacaksak  //*[text()='Add Element']   formati kullanilir
        Atribute kullanilacaksak //*[@class='added-manually']  bu formatta kullanilir
         */

        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin

       // WebElement addRemoveElements= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        WebElement addRemoveElements= driver.findElement(By.xpath("//h3"));
        if (addRemoveElements.isDisplayed()){
            System.out.println("AddRemoveElements TESTİ PASSED");
        }else System.out.println("AddRemoveElements Testi FAILED");
        // sayfayi kapatiniz
        driver.close();



    }
}
