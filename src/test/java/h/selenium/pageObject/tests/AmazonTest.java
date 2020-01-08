package h.selenium.pageObject.tests;

import h.selenium.pageObject.pages.CartPage;
import h.selenium.pageObject.pages.MainPage;
import h.selenium.pageObject.pages.ProductPage;
import h.selenium.pageObject.pages.SearchResultPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AmazonTest extends BaseTest {
    String baseURL = "https://www.amazon.com";

    public static String keyWord;

    public AmazonTest(String values) {
        super();
        this.keyWord = values;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"puzzle"}, {"barbie"}, {"teether"}});
    }

    @Test
    public void comparePrice() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.goToURL(baseURL);
        mainPage.performSearch(keyWord);
        mainPage.selectBabyCategory();

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.checkResultTitles(keyWord);
        searchResultPage.chooseOneProduct();

        ProductPage productPage = new ProductPage(driver);
        String productTitle = productPage.getProductTitle();
        String productPrice = productPage.getProductPrice();
        productPage.addProductToCart();
        productPage.closePopup();
        productPage.openCart();

        CartPage cartPage = new CartPage(driver);
        String productTitleInCart = cartPage.getProductTitleInCart();
        String productPriceInCart = cartPage.getProductPriceInCart();

        assert productTitle.equals(productTitleInCart);
        assert productPrice.equals(productPriceInCart);
    }
}
