package h.selenium.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By firstElementTitle = By.xpath("//span[@id='productTitle']");
    By firstElementPrice = By.xpath("//span[@id='priceblock_ourprice']");
    By addToCart = By.xpath("//input[@id='add-to-cart-button']");
    By cart = By.xpath("//span[@class='nav-line-2'][contains(text(),'Cart')]");
    By closeAttachButton = By.xpath("//a[@id='attach-close_sideSheet-link']");

    public String getProductTitle() {
        String title = find(firstElementTitle).getText();
        return title;
    }

    public String getProductPrice() {
        String price = find(firstElementPrice).getText();
        return price;
    }

    public void addProductToCart() throws InterruptedException {
        find(addToCart).click();
        Thread.sleep(2000);
    }

    public void closePopup() throws InterruptedException {
        try {
            find(closeAttachButton).click();
            Thread.sleep(2000);
        } catch (NoSuchElementException e) {
            System.out.println("No popUp");
        }
    }

    public CartPage openCart() {
        find(cart).click();
        return new CartPage(driver);
    }
}
