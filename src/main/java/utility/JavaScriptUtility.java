package utility;

import org.openqa.selenium.JavascriptExecutor;
import testbase.WebTestBase;

public class JavaScriptUtility extends WebTestBase {

    public static void scrollToElement(String argument) {
        JavascriptExecutor js = (JavascriptExecutor) driver;  //down casting
        js.executeScript(argument);
    }
}
