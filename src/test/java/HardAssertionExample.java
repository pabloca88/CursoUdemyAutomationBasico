import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertionExample {
    WebDriver driver = null;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        driver = new ChromeDriver();

    }

    @Test
    public void hardAssertionExample(){
        driver.get("https://google.com");
        String titleOfGoogleHomePage =  driver.getTitle();
        String expectedTitleOfGoogleHomePage = "Google"; //the correct expected is Google but we forced the error

        String searchTerm = null;
        searchTerm = "TestAutomation.co";

        //HARD ASSESTION TO VALIDATE WE ARE CURRENTLY ON GOOGLE.COM
        Assert.assertEquals(titleOfGoogleHomePage, expectedTitleOfGoogleHomePage);

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
        Assert.assertNotNull(searchTerm); //expectd object not to be null, to trigger ths erase the searchTerm value
        searchBox.sendKeys(searchTerm);

        WebElement submitSearchBtn = driver.findElement(By.name("btnK"));
        submitSearchBtn.submit();
    }


    @AfterMethod
    public void afterMethod(){
        //driver.quit();
    }

}
