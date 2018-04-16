import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 16/07/2017.
 */
public class FaceBook {
    @BeforeTest
    public void Test() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter url
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void Test2() {

        WebDriver driver = null;

      //  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123456789");
//       System.out.println(driver.getTitle());
       // enter username
        driver.findElement(By.xpath("//input[@id='u_0_2']")).sendKeys("abcd");
       // enter surname
        driver.findElement(By.xpath("//input[@id='u_0_4']")).sendKeys("efgs");
        //enter number
        driver.findElement(By.xpath("//input[@id='u_0_7']")).sendKeys("1234567890");
        //enter password
        driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("0987654321");
        //enter date of birth
        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("10");
       driver.findElement(By.xpath("//select[@id='month']")).sendKeys("may");
        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1992");
        //enter gender
       driver.findElement(By.xpath("//span[@id='u_0_k']/span[1]/label")).click();
        String expected = "Male";
        String actual = driver.findElement(By.xpath("//span[@id='u_0_k']/span[2]/label")).getText();
        Assert.assertEquals("Male", expected, actual);
    }

    @AfterTest
    public void Test3() {

      //  driver.close();
    }


}