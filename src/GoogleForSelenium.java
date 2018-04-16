import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 17/07/2017.
 */
public class GoogleForSelenium {
    @Test

    public void Test() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter url
        driver.get("https://www.google.co.uk");//opening google homepage
        //print url
        System.out.println(driver.getCurrentUrl());

        //searching haridham uk
          driver.findElement(By.xpath("//div[@class='sfibbbc']")).click();
                 // driver.findElement(By.xpath("//div[@id='sbse1']/div[1]/span/b")).click();
        //opening ikey uk web from search result
       // driver.findElement(By.xpath("//div[@id=\"rso\"]/div/div/div/div/div/h3/a")).click();
        //loading 'Centres' page
       // driver.findElement(By.linkText("CENTRES")).click();
       // driver.findElement(By.cssSelector("a.btn.donate")).click();
      //  driver.findElement(By.cssSelector("input.form-control")).sendKeys("1550.00");//entering amount in Proposed Donation field
      //  driver.findElement(By.id("calculate")).click();//clicking Calculate button
      //  String expected = "London";//created variable 'expected'
       // String actual = driver.findElement(By.linkText("London")).getText();//created variable 'actual' to do assert Text
       // Assert.assertEquals("On Centres page", expected,actual);//comparing expected==actual. Text is 'London'.



    }
}
