import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 19/07/2017.
 */
public class Google2 {
    @Test
    public void Test(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter url
        driver.get("https://uk.yahoo.com/?p=us");
        //print url
        System.out.println(driver.getCurrentUrl());
        //click on news
        driver.findElement(By.xpath("//div[@id='mega-topbar']/ul/li[3]/a")).click();
        //click on sign in
        driver.findElement(By.xpath("//a[@id='uh-signedin']")).click();
        //enter  username
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("pratibhahsolanki1234@gamil.com");
        //click on help
        driver.findElement(By.xpath("html/body/div[1]/span[2]/a")).click();
        //click on account
        driver.findElement(By.xpath("//nav[@id='productsdiv']/ul/li[1]/a")).click();
        String expected = "BROWSE BY TOPIC";
        String actual = driver.findElement(By.xpath("//div[@id='pltpcs']/h2")).getText();
        Assert.assertEquals("BROWSE BY TOPIC",expected,actual);
    }
}
