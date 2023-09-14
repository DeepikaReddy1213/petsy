package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.Utility;

public class SearchPage extends WebTestBase {

    @FindBy(xpath = "//input[@name='q']")
    WebElement clickOnSearchTextBox;


    @FindBy(xpath = "//span[@class='search-icon search-icon--inactive']")
    WebElement clickOnSearchIcon;

    @FindBy(xpath = "//span[@class='needsclick']")
    WebElement clickBrandCheckBox;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement checkPageText;

    public SearchPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickSearchBox(String productName) {
        ActionUtility.textInSearchBox(clickOnSearchTextBox);
        clickOnSearchTextBox.sendKeys(productName);
    }
     public String verifyPageTitle(){
      return  Utility.PageTitleFunctionality();
     }
    public void clickSearchIcon() {

        ActionUtility.explicitWaitToBeClickable(clickOnSearchIcon);
    }

    public void clickBrandCheckBox() {

        ActionUtility.explicitWaitToBeClickable(clickBrandCheckBox);
    }

    public boolean checkBoxFunctionality() {

        return Utility.verifyIsDisplayedElement(clickBrandCheckBox);
    }

    public boolean searchElementFunctionality() {

        return Utility.verifyElementIsSelected(clickOnSearchIcon);
    }

}