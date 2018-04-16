import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 19/07/2017.
 */
public class OrangeHrm {
    @Test
    public void Test(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open url
        driver.get("http://opensource.demo.orangehrmlive.com/");
        //print url
        System.out.println(driver.getCurrentUrl());
        //enter usarname
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        //enter password
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
        //click on login button
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        //click pim
       driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
        //click on add employe
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
        //enter first name
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("RAHUL");
        //enter middle name
        driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("j");
        //enter last name
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("MAKWANA");
        //enter employe id
        driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("8");
        //expected=actual
        String expected = "Reports";
        String actual = driver.findElement(By.xpath("//a[@id='menu_core_viewDefinedPredefinedReports']")).getText();
        Assert.assertEquals("Reports",expected,actual);
        driver.close();
    }

}
