import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 19/07/2017.
 */
public class Etickets {
    @Test
    public void Test(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter url
        driver.get("http://www.barclays.co.uk/PersonalBanking/P1242557947640");
        //print url
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//div[@id='main-header']/header/div[2]/div/div/div[2]/ul[2]/li[2]")).click();
        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("PRATIBHA");
        driver.findElement(By.xpath("//input[@id='dateOfBirth']")).sendKeys("120292");
        driver.findElement(By.xpath("//input[@id='postCode']")).sendKeys("107");
        driver.findElement(By.xpath("//div[@id='accountType']/fieldset/div/div[1]/p")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='sortCode1']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@id='sortCode2']")).sendKeys("3");
        driver.findElement(By.xpath("//input[@id='sortCode3']")).sendKeys("4");
        driver.findElement(By.xpath("//input[@id='cardNo1']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='cardNo2']")).sendKeys("6");
        driver.findElement(By.xpath("//input[@id='cardNo3']")).sendKeys("7");
        driver.findElement(By.xpath("//input[@id='cardNo4']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='eMailAdd']")).sendKeys("9");
        driver.findElement(By.xpath("//input[@id='eMailAddConfirm']")).sendKeys("1");
        String expected = "Keeping you informed";
        String actual = driver.findElement(By.xpath("//div[@id='page']/div[13]/h3")).getText();
        Assert.assertEquals("Keeping you informed",expected,actual);
        driver.close();



    }
    }


