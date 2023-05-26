package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda system ozelliklerinin ayarlamak icin setProperty methodu ile kullaniriz
        //getProperty methodu ile class'imiza driver'in fiziki yolunu belirtiriz
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" degerinin girerek "value"'ya ulasabilirim
        WebDriver driver= new ChromeDriver();
        driver.get("https://techproeducation.com");//get() methodu ile String olarak girilen url"e gideriz
    }
}
