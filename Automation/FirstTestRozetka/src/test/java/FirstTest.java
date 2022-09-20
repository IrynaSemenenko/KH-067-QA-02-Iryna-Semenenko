import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    @Test
    public void testChrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        driver.manage().window().maximize();
        //// Home page of the Google
        driver.get("https://www.google.com");
        WebElement searchFieldElement = driver.findElement(By.xpath("//input[@name='q']"));
        searchFieldElement.sendKeys("rozetka");
        searchFieldElement.submit();
        //// Home page of the Rozetka
        WebElement firstLinkElem = driver.findElement(By.cssSelector("a[href='https://rozetka.com.ua/']>h3"));
        firstLinkElem.click();
        System.out.println("The correct url: " + driver.getCurrentUrl().equals("https://rozetka.com.ua/"));
        WebElement searchFieldRozetkaElem = driver.findElement(By.xpath("//input"));
        searchFieldRozetkaElem.sendKeys("shauma");
        searchFieldRozetkaElem.sendKeys(Keys.ENTER);
        //// Results page of the Rozetka
        String firstProduct = "//ul[@class='catalog-grid ng-star-inserted']/li[1]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstProduct)));
        WebElement firstProductElem = driver.findElement(By.xpath(firstProduct));
        firstProductElem.click();
        //// Product page
        // Close pop-up ads
        String closeButtonInPopUp = "//span[@class='exponea-close-cross']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(closeButtonInPopUp)));
        WebElement closeButtonInPopUpElem = driver.findElement(By.xpath(closeButtonInPopUp));
        closeButtonInPopUpElem.click();
        // Add the product to the cart
        String buyButton = "//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']";
        WebElement buyButtonElem = driver.findElement(By.xpath(buyButton));
        buyButtonElem.click();
        //// Check that modal window of the cart was opened
        String popUpCartElem = "//rz-single-modal-window/div[1]/..";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(popUpCartElem)));
        WebElement popUpCart = driver.findElement(By.xpath(popUpCartElem));
        System.out.println("Pop-up cart is displayed: " + popUpCart.isDisplayed());
        System.out.println("URL is: " + driver.getCurrentUrl().equals("https://rozetka.com.ua/schauma_3838824208985/p23501425/"));
        driver.quit();
    }
}

