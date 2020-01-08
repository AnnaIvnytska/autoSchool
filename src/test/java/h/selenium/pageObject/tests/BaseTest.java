package h.selenium.pageObject.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setUp() {
        //Create a Chrome driver. All test classes use this.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivnytska\\Desktop\\JAVA AutoSchool_Anna\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}