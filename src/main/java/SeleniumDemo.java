import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class SeleniumDemo {
    public static WebDriver dr = null;

    @BeforeMethod
    public void getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\easha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        dr = new ChromeDriver();

    }
    @Test
    public void openPage() throws InterruptedException {
        dr.get("https://www.ebay.com/");
        dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       }

    @Test
    public void selectPrintedSummerDress() throws InterruptedException {
        dr.findElement(By.xpath("//a[@class='gh-p'][@_sp='m570.l3188']")).click();
        Thread.sleep(3000);

    }
        @AfterMethod
        public void tearDown () {
        dr.close();

        }

}