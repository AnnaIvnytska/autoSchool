package h.selenium.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    By searchField = By.xpath("//*[@id='twotabsearchtextbox']");
    By searchDropdown = By.xpath("//select[@id='searchDropdownBox']");
    By categoryBaby = By.xpath("//option[contains(text(),'Baby')]");
    By buttonGo = By.xpath("//input[@value='Go']");

    public MainPage goToURL(String baseURL) {
        driver.get(baseURL);
        return this;
    }

    public void selectBabyCategory() {
        find(searchDropdown).click();
        find(categoryBaby).click();
    }

    public SearchResultPage performSearch(String searchParameter) {
        find(searchField).sendKeys(searchParameter);
        find(buttonGo).click();
        return new SearchResultPage(driver);
    }
}
