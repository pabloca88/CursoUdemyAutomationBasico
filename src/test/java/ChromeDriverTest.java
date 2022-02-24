import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ChromeDriverTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());       // title on the corner of the tab
        System.out.println(driver.getCurrentUrl());  //sout + tab for System.out.println(); shortcut

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("TestAutomation.co");


        WebElement submitSearchBox = driver.findElement(By.name("btnK"));
        submitSearchBox.submit();

        driver.quit();


    }
}
