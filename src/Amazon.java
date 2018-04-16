import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 16/07/2017.
 */
public class Amazon {
    @Test
    public void Test(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //opening website
        driver.get("https://amazon.co.uk");

        //loading help page
        driver.findElement(By.linkText("Help")).click();
        //selecting "Device Support" from help page
        driver.findElement(By.linkText("Device Support")).click();
        driver.findElement(By.xpath("//p/a[text()=\"Fire 7\"]")).click();
        driver.findElement(By.id("a-autoid-3-announce")).click();
        //clicked on create account
        driver.findElement(By.linkText("Create your Amazon account")).click();
        //enter name
        driver.findElement(By.id("ap_customer_name")).sendKeys("ABCD");
        //enter email id
        driver.findElement(By.id("ap_email")).sendKeys("pratibhasolanki1234@gmail.com");
        //enter password
        driver.findElement(By.id("ap_password")).sendKeys("12345678");
        //chech password
        driver.findElement(By.id("ap_password_check")).sendKeys("12345678");
        //expected = actual result
        String expected  = "Sign in";
        String actual=driver.findElement(By.cssSelector("h1.a-spacing-small")).getText();
        Assert.assertEquals( "Sign in",expected,actual);
        driver.findElement(By.id("continue")).click();
       // driver.close();


    }
}
