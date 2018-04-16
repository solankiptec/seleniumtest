import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 18/07/2017.
 */
public class NextToChoice {
    @Test

    public void Test(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter url
        driver.get("http://www.next.co.uk/");
        System.out.println(driver.getCurrentUrl());
        //click on my account
        driver.findElement(By.xpath("html/body/header/div/section/section[2]/ul/li[1]/a")).click();
        //enter email id
        driver.findElement(By.xpath("//input[@id='EmailOrAccountNumber']")).sendKeys("pratibhasolanki1234@gmail.com");
        //entere password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345678");
        //click on shop next
        driver.findElement(By.xpath("//ul[@id='steps']/li[1]/a")).click();
        //click on store locator
        driver.findElement(By.xpath("html/body/header/div/section/section[2]/ul/li[4]/a")).click();
        //click on quickshop
        driver.findElement(By.xpath("//body[@id='next-co-uk']/header/div/section/section[2]/ul/li[2]/a")).click();
        //enter item number and size
        driver.findElement(By.xpath("//input[@id='IQS1']")).sendKeys("12");
        driver.findElement(By.xpath("//input[@id='SQS1']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@id='IQS2']")).sendKeys("13");
        driver.findElement(By.xpath("//input[@id='SQS2']")).sendKeys("2");
        driver.findElement(By.xpath("//tr[@id='QS3']/td[1]/input")).sendKeys("10");
        driver.findElement(By.xpath("//tr[@id='QS3']/td[1]/input")).sendKeys("14");
        driver.findElement(By.xpath("//input[@id='SQS3']")).sendKeys("3");
        driver.findElement(By.xpath("//input[@id='SQS5']")).sendKeys("4");
        driver.findElement(By.xpath("//input[@id='IQS6']")).sendKeys("17");
        driver.findElement(By.xpath("//input[@id='SQS6']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='IQS7']")).sendKeys("18");
        driver.findElement(By.xpath("//input[@id='SQS7']")).sendKeys("6");
        driver.findElement(By.xpath("//input[@id='IQS8']")).sendKeys("19");
        driver.findElement(By.xpath("//input[@id='SQS8']")).sendKeys("7");
        driver.findElement(By.xpath("//input[@id='IQS9']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='SQS9']")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='IQS10']")).sendKeys("21");
        driver.findElement(By.xpath("//input[@id='SQS10']")).sendKeys("9");
        //expected = actual
        String expected = "ADD TO BAG";
        String actual = driver.findElement(By.xpath("//div[@id='QuickshopWrap']/div[3]/a[2]")).getText();
        Assert.assertEquals("ADD TO BAG",expected,actual);
        //window close
        driver.close();

    }
}
