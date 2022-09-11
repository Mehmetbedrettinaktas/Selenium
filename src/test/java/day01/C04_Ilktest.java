package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_Ilktest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        1- amazon sayfasina gidiniz
        2- Basligin "Amazon" icerdigini test ediniz
        3- URL'nin "Amazon" icerdigini test ediniz
        4- Sayfayi kapatiniz
         */
        driver.manage().window().maximize();
        // 1- amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        //  2- Basligin "Amazon" icerdigini test ediniz
        System.out.println("Actual Title() = " + driver.getTitle());
        String actualTitle=driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

        // 3- URL'nin amazon icerdigini test ediniz
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // driver.getCurrentUrl() = https://www.amazon.com/
        String actualUrl= driver.getCurrentUrl();
        String arananKelime= driver.getCurrentUrl();
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");
        //   4- Sayfayi kapatiniz
        driver.close();
    }
}
