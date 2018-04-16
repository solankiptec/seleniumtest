import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 16/07/2017.
 */
public class NopCommerce {

    @Test

    public void Test(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter url
        driver.get("https://www.nopcommerce.com/");
        //print url
        System.out.println(driver.getCurrentUrl());
        //click on login button
        driver.findElement(By.xpath("//div[@id='header']/div[2]/div/ul[1]/li[2]/a")).click();
        //enter username
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName']")).sendKeys("PRATIBHA");
        //enter password
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_Password']")).sendKeys("ABCDEFG");
        //click on login button
        driver.findElement(By.xpath("//div[@id='header']/div[2]/div/ul[1]/li[2]/a")).click();
        //click on register button
        driver.findElement(By.xpath("//div[@id='header']/div[2]/div/ul[1]/li[1]/a")).click();
        //enter firstname
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName']")).sendKeys("pratibha");
        //enter lastname
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName']")).sendKeys("SOLANKI");
        //enter email id
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email']")).sendKeys("pratibhasolanki1234@gmail.com");
        // enter username
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName']")).sendKeys("pratibha");
        //enter city name
        driver.findElement(By.xpath("//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry']")).isSelected();
        //enter your role
        driver.findElement(By.xpath("//select[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ddlCountry']")).isSelected();
        //enter your password
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password']")).sendKeys("12345678");
        //entre your conform password
        driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword']")).sendKeys("12345678");
        //expected = actual
        String expected  = "Your Personal Details ";
        String actual=driver.findElement(By.xpath("//table[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm']/tbody/tr[1]/td/table/tbody/tr/td/div[2]")).getText();
        Assert.assertEquals( "Your Personal Details ",expected,actual);
        driver.close();


    }
}
