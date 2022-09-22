package rozetka.task1AddProductToTheCart;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProductToCart {
    @Test
    public void testChrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
// Home page of the Google
        driver.get("https://www.google.com");
        WebElement searchFieldElement = driver.findElement(By.xpath("//input[@name='q']"));
        searchFieldElement.sendKeys("rozetka");
        searchFieldElement.submit();
// Home page of the Rozetka
        WebElement firstLinkElem = driver.findElement(By.xpath("(//div[@class='yuRUbf']/a//h3)[1]"));
        firstLinkElem.click();
        System.out.println("The correct url: " + driver.getCurrentUrl().equals("https://rozetka.com.ua/"));
// Search the first product
        WebElement searchFieldRozetkaElem = driver.findElement(By.xpath("//input"));
        searchFieldRozetkaElem.sendKeys("shauma");
        searchFieldRozetkaElem.sendKeys(Keys.ENTER);
// Results page of the Rozetka
        String firstProduct = "//ul[@class='catalog-grid ng-star-inserted']/li[1]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstProduct))).click();
// Add product to the cart
        String buyButton = "(//ul[@class='product-buttons']//button)[1]";
        WebElement titleProductPage = driver.findElement(By.xpath("//div/h1"));
        actions.moveToElement(titleProductPage).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(buyButton))).click();
// Check that modal window of the cart was opened
        try {
            String popUpCartElem = "//rz-single-modal-window/div[1]/..";
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popUpCartElem)));
            System.out.println("Pop-up cart is displayed");
        } catch (TimeoutException timeoutException) {
    // Go to the cart
            String cartButtonInHeader = "//li[@class='header-actions__item header-actions__item--cart']";
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cartButtonInHeader))).click();
            System.out.println("Pop-up cart is not displayed");
        }
// Go to order
        String toOrderButton = "//a[@class='button button_size_large button_color_green cart-receipt__submit ng-star-inserted']";
        String titleOrderPage = "//div//h1";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(toOrderButton))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titleOrderPage)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        System.out.println("Expected url matches:" + driver.getCurrentUrl().equals("https://rozetka.com.ua/checkout/"));
        driver.quit();
    }
}

