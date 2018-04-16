import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 24/07/2017.
 */
public class OrangeHrmRegistration {
    WebDriver driver;

@OrangeHrmRegistration.BeforeMathod
public void openFirefox( ){
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://opensource.demo.orangehrmlive.com/");
}
@Test
    public void test(){
    //enter user name
    myEnterText(By.cssSelector("input#txtUsername"), "Admin");
    //enter password
    myEnterText(By.cssSelector("input#txtPassword"), "admin");
    //click log-in button
    myClickId("btnLogin");
    //clicking "PIM" from categories
    myClick(By.linkText("PIM"));
    // clicking Employee list 
    myClick(By.linkText("Employee List"));
    //clicking "Add" button
    myClickId("btnAdd");
    //entering first name
    myClickIdEnterText("firstName", "Bhagirath");
    //entering last name
    myClickIdEnterText("lastName", "Vaghela");
    //entering Employee Id
    String myDate = new SimpleDateFormat("yyMMddHHmm").format(Calendar.getInstance().getTime());
    driver.findElement(By.id("employeeId")).sendKeys(myDate);
    clearAndEnterText(By.id("employeeId"),myDate);
    //Storing value of myDate
    String uniqueId = myDate;
    //ticking "Create Login Details" button
    myClickId("chkLogin");
    //enter user name
    randomNumber(By.id("user_name"), "bhagrat");
    //enter password
    myClickIdEnterText("user_password", "sunflower");
    //re-enter password
    myClickIdEnterText("re_password", "sunflower");
    //click save
    myClickId("btnSave");
    //click on "Welcome name"
    myClickId("welcome");
    //click Logout
    myClick(By.linkText("Logout"));
    //close firefox
    closeFirefox();

    //oper firefox
    openFirefox();
    //enter user name
    driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("bhagrat" + "" + uniqueId+"@yaho.com");
    //enter password
    myEnterText(By.cssSelector("input#txtPassword"), "sunflower");
    //click log-in button
    myClickId("btnLogin");
    //click on "my Info" from categories
    myClick(By.linkText("My Info"));
    //click on Edit button
    myClickId("btnSave");
    //Edit Gender. Click on Male radio button
    myClickId("personal_optGender_1");
    //edit License Expiry Date (06 Jan 1980)
    myClickId("personal_txtLicExpDate");
    //select Month (March)
    
    //select Year (1980)
    mySelectByValue(By.xpath("//select[@class=\"ui-datepicker-year\"]"), "1980");
    //select day (14)
    driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/table/tbody/tr/td[7]/a")).click();
    //input text in "Other ID"
    myClickIdEnterText("personal_txtOtherID", "Sunflower 009");
    //Assert Text
    myAssertEquals("Welcome Bhagirath", By.id("welcome"), "Welcome Bhagirath is not visible");
}

    private void clearAndEnterText(By employeeId, String myDate) {
    }

    private void randomNumber(By user_name, String bhagrat) {
    }

    private void mySelectByValue(By xpath, String s) {
    }

    private void myClickIdEnterText(String personal_txtOtherID, String s) {
    }

    private void myAssertEquals(String s, By welcome, String s1) {
    }

    private void myEnterText(By by, String sunflower) {
    }

    private void myClick(By by) {
    }

    private void myClickId(String chkLogin) {
    }


    @AfterMethod
public void closeFirefox(){
    driver.close();
    }

    /**
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    public @interface BeforeMathod {
    }
}
