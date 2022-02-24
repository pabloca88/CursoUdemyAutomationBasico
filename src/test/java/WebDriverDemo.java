import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class WebDriverDemo {

    public static void main(String[] args) {
        // no colocar annotations dentro de un main para correr con TestNGs
        System.setProperty("webdriver.chrome.driver", "/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());       // title on the corner of the tab
        System.out.println(driver.getCurrentUrl());  //sout + tab for System.out.println(); shortcut

        //System.out.println("It's page source: " + driver.getPageSource());  //not used commonly

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("TestAutomation.co");

        WebElement submitButton = driver.findElement(By.name("btnK"));
        submitButton.submit();

        driver.quit();
    }
};
