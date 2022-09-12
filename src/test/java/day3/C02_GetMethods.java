package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethods {
    public static void main(String[] args) {
        /*
        Amazon sayfasina gidiniz
        Arama kutusunu locate ediniz
        Arama kutusunun tagName'nin input  oldugunu test ediniz
        Arama kutusunun name atributu'nun degerinin field-keywords oldugunu test ediniz
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //Arama kutusunun tagName'nin input  oldugunu test ediniz
        String expectedTagname="input";
        String actualTagName=aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagname)){
            System.out.println("TagName testi PASSED" +actualTagName);
        } else System.out.println("TagName Testi FAILED"+actualTagName);

        //Arama kutusunun name atributu'nun degerinin field-keywords oldugunu test ediniz
        String expectedAtributuName="field-keywords";
        String actualAtributuName= aramaKutusu.getAttribute("name");
        if (actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Atributu testi PASSED");
        }else System.out.println("Atributu Testi FAILED");

        //Arama kutusunun konumunu yazdiriniz
        System.out.println("arama kutusu Konumu" +aramaKutusu.getLocation());
        // sayfayi kapatiniz
        driver.close();

    }
}
