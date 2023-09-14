package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.Utility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[@class='social-link Facebook']")
    WebElement clickOnFacebookLogo;

    @FindBy(xpath = "(//span[@class='navmenu-icon navmenu-icon-depth-1'])[2]")
    WebElement moveOnCats;

    @FindBy(xpath = "//a[@href='/collections/cat-food']")
    WebElement moveOnCatsFoodAndTreats;

    @FindBy(xpath = "//input[@name='q']")
    WebElement clickSearchBox;

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void clickOnFacebookLogo() throws InterruptedException {
        Utility.explicitWaitToBeClickable(clickOnFacebookLogo);
        Utility.switchWindow();

    }

    public void checkMouseOverOnCats() {
        ActionUtility.verifyMoveOverFunctionality(moveOnCats);
    }

    public void clickOnCatsFoodAndTreats() {
        ActionUtility.explicitWaitToBeClickable(moveOnCatsFoodAndTreats);
    }

    public String getTheCurrentPageUrl() {
        return Utility.getPageUrl();

    }
}


