package utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static testbase.WebTestBase.driver;

public class ActionUtility {
    public static final long IMPLICIT_WAIT = 100;

    public static final long PAGE_LOAD = 150;

    public static final long EXPLICIT_WAIT = 100;

    public static WebDriverWait wait;

    public static void explicitWaitToBeClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void textInSearchBox(WebElement Element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(Element).perform();

    }
    public static void verifyMoveOverFunctionality(WebElement Element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(Element).perform();
    }
}
