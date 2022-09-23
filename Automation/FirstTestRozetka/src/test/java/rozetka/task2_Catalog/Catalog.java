package rozetka.task2_Catalog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Catalog {
    String url = "https://rozetka.com.ua";
    By catalogButton = By.id("fat-menu");
    By monitorButton = By.xpath("//li[@class='ng-star-inserted']/a[@href='https://hard.rozetka.com.ua/ua/monitors/c80089/']");
    By rozetkaCheckBox = By.xpath("//li/a[@data-id='Rozetka']");
    By firstProduct = By.xpath("//ul[@class='catalog-grid ng-star-inserted']/li[1]");
    By titleProductPage = By.xpath("//div/h1");
    By autumnSale = By.xpath("//ul[@class='menu-categories ng-star-inserted']/li[17]");
    By saleLaptop = By.xpath("(//span[@class='categories-filter__link-title'])[3]");
    By filterSeller = By.xpath("(//div[@class='horizontal-block ng-star-inserted']/div)[3]");
    By selectedSeller = By.xpath("//ul//a[@href='/ua/promo/autumnsale/?section_id=80253']");

    @Test
    public void openMonitorFromCatalog() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(catalogButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(monitorButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(rozetkaCheckBox)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct)).click();
        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(titleProductPage)).getText());
        System.out.println("Expected url matches: " + driver.getCurrentUrl().equals("https://hard.rozetka.com.ua/ua/samsung_lc27g55tqwixci/p250707941/"));
        driver.quit();
    }

    @Test
    public void selectFilterSeller() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(catalogButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(autumnSale)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(saleLaptop)).click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(filterSeller)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(rozetkaCheckBox)).click();
            System.out.println("Is filter seller selected? Answer:  " + wait.until(ExpectedConditions.presenceOfElementLocated(selectedSeller)).isDisplayed());
        } catch (RuntimeException runtimeException) {
            System.out.println("Seller filter ia not displayed");
        } finally {
            driver.quit();
        }
    }
}
