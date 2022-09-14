package TeamQA11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_OdevXpath {
    /*
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    3- 10 kez Add element butonuna basildigini test edini
    4- Delete butonu gorunmeyene kadar basiniz
    5- Delete butonunun gorunmedigini test ediniz
    6- Sayfayi Kapatiniz

*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");
        // 2- Add Element butonuna 10 kez basin
        WebElement addElement = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        addElement.click();
        int sayac=0;
        for (int i = 0; i <10 ; i++) {
            addElement.click();
            sayac++;
        }
        // 3- 10 kez Add element butonuna basildigini test edini
        Thread.sleep(2000);
        if(sayac==10){
            System.out.println("Butona "+ sayac+ "  kez basılmıştır test PASSED");
        }else System.out.println("Butona basılma testi FAILAD");

        // 4- Delete butonu gorunmeyene kadar basiniz
        List<WebElement> deleteButon=driver.findElements(By.xpath("//*[@class='added-manually']"));
        int basmaSayisi=10;
        for (int i=0; i <10 ; i++) {
            deleteButon.get(i).click();
            basmaSayisi--;
        }
        // 5- Delete butonunun gorunmedigini test ediniz
        if(basmaSayisi==0){
            System.out.println("Delete butonuna 10 kez basıldığından Button görünmüyor test PASSED");
        }else System.out.println("Delete butonuna 10 kez basılmadığından test FAILED");
        // 6- Sayfayi Kapatiniz
        driver.close();
    }
}
