package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_MangeMethodsWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Gidinlen sitenin istedigimiz kadar beklemesini sagliyor

        driver.get("https://www.amazon.com");
        /*
        İleride wait konusunu daha geniş olarak ele alacağız
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre bir
        yükleme süresine ihtiyaç vardır veya bir webelementin kullanılabilmesi için zaman ihtiyaç olabilir.
        imlicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        MAXIMUM sureyi belirleme olanağı tanir
         */
        //implicity, çalısmıyorsa beklemez kapanır.
        //thread.sleep çalışsada çalısmasada verdiginiz saniye kadar bekler.
        driver.close();
    }
}
