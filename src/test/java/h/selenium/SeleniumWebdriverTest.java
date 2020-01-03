package h.selenium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)

public class SeleniumWebdriverTest {
    private String keyWord;

    public SeleniumWebdriverTest(String values) {
        super();
        this.keyWord = values;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"puzzle"}, {"toy"}, {"teether"}});
    }

    @Test
    public void testAmazon() throws InterruptedException {
        // 1. Открываем сайт https://www.amazon.com
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivnytska\\Desktop\\JAVA AutoSchool_Anna\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        //2. Меняем категорию поиска на Baby
        WebElement allDropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        allDropdown.click();

        WebElement babyCategory = driver.findElement(By.xpath("//option[contains(text(),'Baby')]"));
        babyCategory.click();

        //3. В поле поиска вводим ключевое слово: 'puzzle/toy/teether' и нажимаем значок поиска (лупу)
        WebElement searchField = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchField.sendKeys(keyWord);

        WebElement goButton = driver.findElement(By.xpath("//input[@value='Go']"));
        goButton.click();

        //4. Проверяем, что тайтл страницы содержит ключевое слово
        assert (driver.getTitle().contains(keyWord));

        // 5. Проверяем, что каждый из результатов поиска содержит ключевое слово puzzle
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

        // 6. Берем первый из найденных товаров и запоминаем его полное название и цену
        WebElement firstElement = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']//span[contains(text()," + keyWord + ")])[4]"));
        firstElement.click();

        WebElement firstElementTitle = driver.findElement(By.xpath("//span[@id='productTitle']"));
        WebElement firstElementPrice = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));

        String title = firstElementTitle.getText();
        String price = firstElementPrice.getText();

        // 7. Добавляем его в корзину
        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCart.click();
        Thread.sleep(2000);
//        WebElement closeAttachButton = driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
//        closeAttachButton.click();
//        Thread.sleep(2000);

        // 8. Открываем корзину и сравниваем название и цену в "Subtotal" на соответствие с сохраненными значениями
        WebElement cart = driver.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Cart')]"));
        cart.click();
        WebElement firstElementTitleInCart = driver.findElement(By.xpath("//div[@id='sc-active-cart']//li[1]"));
        String titleInCart = firstElementTitleInCart.getText();
        WebElement firstElementPriceInCart = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']"));
        String priceInCart = firstElementPriceInCart.getText();
        assert title.equals(titleInCart);
        assert price.equals(priceInCart);

        driver.close();
    }
}