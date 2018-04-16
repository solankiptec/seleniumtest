import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 14/11/2017.
 */
public class TrialClass {

    @Test

    public void tryToLearnSomethingNew()throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://kamalsha6.wixsite.com/oraclea2r");
        driver.manage().deleteAllCookies();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.id("DrpDwnMn11label")).click();
        driver.findElement(By.xpath("//p[@id='DrpDwnMn1moreContainer2label']")).click();
        driver.findElement(By.xpath("//p[@id='DrpDwnMn12label']")).click();
        driver.findElement(By.xpath("//p[@id='DrpDwnMn1moreContainer2label']")).click();
        driver.findElement(By.xpath("//p[@id='DrpDwnMn13label']")).click();
        driver.findElement(By.xpath("//p[@id='DrpDwnMn14label']")).click();
        String myDate = new SimpleDateFormat("yyMMddHHmm").format(Calendar.getInstance().getTime());
        driver.findElement(By.id("field1")).sendKeys(myDate);
        String myName = new SimpleDateFormat("yyMMddHHmm").format(Calendar.getInstance().getTime());
        driver.findElement(By.id("field2")).sendKeys(   "pratibha",myName +"@gmail.com");
        driver.findElement(By.id("field3")).sendKeys("0123456789");
        driver.findElement(By.id("field5")).sendKeys("Financial");
        driver.findElement(By.id("CntctFrm0fieldMessage")).sendKeys("financial web");
        driver.findElement(By.id("CntctFrm0submit")).click();
    }
    @Test
    public void tryTOLearn(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.oraclea2r.com/");
        driver.manage().deleteAllCookies();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[@href='/about-us']")).click();
        WebElement element = driver.findElement(By.xpath("//nav[@id='1233161783']/ul/li[5]/a"));
        String text = element.getText();
        driver.findElement(By.xpath("//nav[@id='1233161783']/ul/li[2]/a")).click();
      //  driver.findElement(By.xpath("//nav[@id='1233161783']/ul/li[3]/a")).click();
      //  driver.findElement(By.xpath("")).click();
       // driver.findElement(By.xpath("")).click();
        //driver.findElement(By.xpath("")).click();



    }
}
