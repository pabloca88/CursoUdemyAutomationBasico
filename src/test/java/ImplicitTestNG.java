import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitTestNG {

    WebDriver driver = null;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        driver = new ChromeDriver();
        //implicit wait:
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testImplicit(){
        driver.get("https://www.testautomation.co/webelements/");
        driver.findElement(By.id("link2courses1")).click();
        //correct webElement = link2courses ; we forced the "no such element exception"

    }

    @AfterMethod
    public void afterMethod(){
    //driver.quit();
    }


}
