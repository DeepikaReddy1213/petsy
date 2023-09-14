package utility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static testbase.WebTestBase.driver;

public class Utility {

    public static final long IMPLICIT_WAIT = 200;

    public static final long PAGE_LOAD = 250;

    public static final long EXPLICIT_WAIT = 200;

    public static WebDriverWait wait;

    public static void explicitWaitToBeClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void switchWindow() {

        String parentWindowId = driver.getWindowHandle();
        //fetch the child window browser
        Set<String> allWindowId = driver.getWindowHandles();

        for (String s : allWindowId) {
            if (!parentWindowId.contentEquals(s)) {
                driver.switchTo().window(s);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.close();
            }
            driver.switchTo().window(parentWindowId);
        }

    }
    public static boolean verifyElementSelectedFunctionality(WebElement element) {
        return element.isDisplayed();
    }
        public static String PageTextFunctionality(WebElement element) {
        return element.getText();
    }
    public static String PageTitleFunctionality() {
        return driver.getTitle();
    }


    public static String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public static boolean verifyIsDisplayedElement(WebElement element) {
        return element.isDisplayed();

    }

    public static void dropDownFunctionality(WebElement element) {
        Select select = new Select(element);
        select.selectByValue("best-selling");
        select.selectByVisibleText(" Alphabetically, Z-A");
        select.selectByIndex(4);
    }
    public static boolean verifyIsElementDisplayed(WebElement element) {
        return element.isDisplayed();

    }

    public static boolean verifyElementIsSelected(WebElement element) {
        return element.isSelected();

    }

}



