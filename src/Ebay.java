import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 19/07/2017.
 */
public class Ebay {
    @Test
    public void Test(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.sword-activerisk.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println("****************");

        driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Risk Management");
        driver.findElement(By.id("searchsubmit")).click();

        //assert
        String expected = "Risk Management";
        String actual=driver.findElement(By.xpath("//*[@id=\"post-9517\"]/h3/strong/span[1]")).getText();
        Assert.assertEquals("Risk Management",expected,actual);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("****************");
        //second seach
        driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Leverage");
        driver.findElement(By.id("searchsubmit")).click();
        //assert
        String expectedRegisterUrl ="http://www.sword-activerisk.com/?s=Leverage";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedRegisterUrl),"To verify that user is able to search");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("****************");
        //third search
        driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("Compatibility");
        driver.findElement(By.id("searchsubmit")).click();
        //assert
        expectedRegisterUrl = "http://www.sword-activerisk.com/?s=Compatibility";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedRegisterUrl),"To verify that user is able to search");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());












        //  driver.get("https://www.ebay.co.uk/");
//        //print url
        //System.out.println(driver.getCurrentUrl());



//        //click on sing in
//        driver.findElement(By.xpath("//li[@id='gh-eb-My']/div/a[1]")).click();
//        //click on register
//        driver.findElement(By.xpath("//div[@id='regTab']")).click();
//        //enter firstname
//        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("rahul");
//        //enter lastname
//        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("makwana");
//        //enter password
//        driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("12345678r");
//         driver.findElement(By.xpath("//div[@id='sgnTab']")).click();
//
//       String expected = "eBay";
//       String actual=driver.findElement(By.xpath("//header[@id='gh']/table/tbody/tr/td")).getText();
//        Assert.assertEquals("eBay",expected,actual);
//        driver.findElement(By.className("fld")).sendKeys("rahulmakert@gmail.com");
//       // driver.close();
    }
}
