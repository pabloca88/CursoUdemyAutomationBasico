import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ElementById {

    WebDriver driver = null;

    @BeforeMethod
    public void beforeMethod(){

    System.setProperty("webdriver.chrome.driver", "/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://www.testautomation.co/webelements\"");
    }


    @Test
    public void testById() {
      WebElement name = driver.findElement(By.id("legalname"));
      name.sendKeys("John");
      name.clear();
      name.sendKeys("John Doe");
      System.out.println(name.isDisplayed());
      System.out.println(name.isEnabled());
      System.out.println(name.isSelected());

      name.clear();
      //MANAGE MULTIPLE ELEMENTS WITH THE SAME NAME
      driver.findElement(By.name("yourname")).sendKeys("Mike");
      List<WebElement> names = driver.findElements(By.name("yourname"));
      names.get(1).sendKeys("Mikey");

    }

    @AfterMethod
    public void afterMethod(){
    //driver.quit();
    }
}
