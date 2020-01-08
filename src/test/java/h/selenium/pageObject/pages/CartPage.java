package h.selenium.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By firstElementTitleInCart = By.xpath("//div[@id='sc-active-cart']//li[1]");
    By firstElementPriceInCart = By.xpath("//span[@id='sc-subtotal-amount-activecart']");

    public String getProductTitleInCart() {
        String titleInCart = find(firstElementTitleInCart).getText();
        return titleInCart;
    }

    public String getProductPriceInCart() {
        String priceInCart = find(firstElementPriceInCart).getText();
        return priceInCart;
    }
}
