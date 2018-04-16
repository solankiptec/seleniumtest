import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 17/07/2017.
 */
public class Thetimes {
    @Test

    public void Test(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //ENTER URL
        driver.get("https://join.thetimes.co.uk/");
        //PRINT URL
        System.out.println(driver.getCurrentUrl());
        //CLICK ON SUBSCRIBE BUTTON
        driver.findElement(By.xpath("//div[@id='a3J200000004NC8EAM']/div/div[2]/button")).click();
        //CLICK ON TITLE
        driver.findElement(By.xpath("//select[@id='title']")).click();
        //CLICK ON OPTION
        driver.findElement(By.xpath("//select[@id=\"title\"]/option[4]")).click();
        //ENTER FIRSTNAME
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("pratibha");
        //ENTER LASTNAME
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("solanki");
        //ENTER EMAIL ID
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratibhasolanki1234@gmail.com");
        //ENTER CONFORM EMAILID
        driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("pratibhasolanki1234@gmail.com");
        //ENTER PASSWORD
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
        //ENTER CONFORM PASSWORD
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("12345678");
        //ENTER DATEOFBIRTH
        driver.findElement(By.xpath("//select[@id='dateOfBirthDay']")).click();
        driver.findElement(By.xpath("//select[@id='dateOfBirthDay']/option[10]")).click();
        driver.findElement(By.xpath("//select[@id='dateOfBirthMonth']")).click();
        driver.findElement(By.xpath("//select[@id='dateOfBirthYear']")).click();
        driver.findElement(By.xpath("//select[@id='dateOfBirthYear']/option[26]")).click();
        //ENTER PHONE NUMBER
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543210");
        //AXPECTED = ACTUAL
        String axpected = "Title * ";
        String actual = driver.findElement(By.xpath("//form[@id='accountCreation_form']/div/fieldset/div[1]/label")).getText();
        Assert.assertEquals("Title * ",axpected,actual);
        //WINDOW CLOSE
        driver.close();



    }
}
