import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RadioButtonExample {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testRadioButton() {
        driver.get("https://www.testautomation.co/webelements");
       // driver.findElements(By.name("browser")); //encuentra una lista por ende es mejor:

        List<WebElement> browserRadios = driver.findElements(By.name("browser"));
        browserRadios.get(1).click();

        //if developer changes the position of the element,lets make the code more ROBUST then:

        for(WebElement radio:browserRadios)
        {   //print each value
            System.out.println(radio.getAttribute("value"));
            //Get the value and select the correct value: "ie" on this example
            if (radio.getAttribute("value").equals("safari"))
            {
                radio.click();
            }

        }
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
