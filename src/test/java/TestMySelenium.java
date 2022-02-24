import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMySelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }
}
