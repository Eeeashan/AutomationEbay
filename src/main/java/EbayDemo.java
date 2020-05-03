import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class EbayDemo  {

   public WebDriver driver=null;
   @BeforeClass
    public void getDriver (){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\easha\\Downloads\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.ebay.com/");
    }

    @Test
    public void clickDeals() throws InterruptedException {
       driver.findElement(By.xpath("//a[@class='gh-p'][@_sp='m570.l3188']")).click();
       Thread.sleep(1000);
    }
   /* @Test
    public void clickSignIn(){
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
    }*/
    @Test
    public void searchHeadphone() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("earphones", Keys.ENTER);
        Thread.sleep(2000);
    }
    @Test
    public void selectEarPhone() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[3]/div[1]/div[1]/div/div[1]/div/div[2]/h3/a/span")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void checkBox() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ADDON_0-checkbox\"]")).click();
        Thread.sleep(1000);
    }
  /*  @Test(priority = 3)
    public void addPlan() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div/div[5]/div/div/div/div[2]/div/div[3]/div/button[2]")).click();
        Thread.sleep(1000);
    }*/
    @Test(priority = 4)
    public void addToCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"isCartBtn_btn\"]")).click();
        Thread.sleep(3000);
    }
    @AfterClass
    public void close(){
        driver.close();
    }
}
