import com.thoughtworks.selenium.webdriven.ElementFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 05/08/2017.
 */
public class Tesco {
    WebDriver driver;


    public static void main(String[] args) {
        Tesco tesco = new Tesco();
        tesco.verifySerchResult("");
    }

    public void verifySerchResult(String product) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //enter url
        driver.get("https://www.tesco.com/");
        driver.findElement(By.cssSelector("div.search-logo-container > div.search-bar > form.search-form > div.search-input-panel > input[name=\"searchKey\"]")).sendKeys("pemperse");
        driver.findElement(By.cssSelector("div.search-logo-container > div.search-bar > form.search-form > button.search-icon-button")).click();

        WebElement productcontainer = driver.findElement(By.className("productLists"));
        List<WebElement> productNames = productcontainer.findElements(By.xpath("//ul[@class=\"products grid\"]/li/div/h2/a/span[2]"));
        java.util.Iterator<WebElement> x = productNames.iterator();
        while (x.hasNext()) {
            WebElement productName = x.next();
            System.out.println(productName.getText());
            Assert.assertTrue(productName.getText().contains(product));
        }
    }
}


