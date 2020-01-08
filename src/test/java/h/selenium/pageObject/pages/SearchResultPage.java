package h.selenium.pageObject.pages;

import h.selenium.pageObject.tests.AmazonTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage{

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    String keyWord = AmazonTest.keyWord;
    By product = By.xpath("(//a[@class='a-link-normal a-text-normal']//span[contains(text()," + keyWord + ")])[8]");

    public void checkResultTitles(String keyWord) {
        WebElement select = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        List<WebElement> resultList = select.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        List<String> currentOptions = new ArrayList<>();
        for (WebElement match : resultList) {
            currentOptions.add(match.getText());
        }
        ArrayList<String> titlesException = new ArrayList<>();
        for (String str : currentOptions) {
            if (!str.toLowerCase().contains(keyWord)) {
                titlesException.add(str);
            }
        }
        System.out.println("Position(s) without ' " + keyWord + " ' word in title: " + titlesException.toString());

    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public ProductPage chooseOneProduct() {
        find(product).click();
        return new ProductPage(driver);
    }
}









