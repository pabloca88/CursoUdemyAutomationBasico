import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitTestNG {
    WebDriver driver = null;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        driver = new ChromeDriver();

    }

    @Test
    public void testExplicit(){
        driver.get("https://testautomation.co/webelements/");

        //we use an explicit wait to wait for the element
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("explibutton")));

        driver.findElement(By.id("explibutton")).click();


    }

    @AfterMethod
    public void afterMethod(){
        //driver.quit();
    }
}
