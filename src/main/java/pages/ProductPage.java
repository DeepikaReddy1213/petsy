package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.JavaScriptUtility;
import utility.StaticWait;
import utility.Utility;

public class ProductPage extends WebTestBase {


    @FindBy(xpath = "//a[@href='/collections/new-products']")
    WebElement clickOnNew;

    @FindBy(xpath = "//a[@class='productitem--image-link']")
    WebElement clickAdultFoodImg;

    @FindBy(xpath = "//span[@class='atc-button--text']")
    WebElement clickOnAddToCart;

    @FindBy(xpath = "//h1[@class='collection--title']")
    WebElement productPageText;

    @FindBy(xpath = "//div[@class='cart_icon cart_close close_drawer']")
    WebElement clickOnCloseIcon;

    @FindBy(id = "product_grid_sort")
    WebElement clickFeaturedBtn;

    @FindBy(xpath = "//div[@class='utils-sortby-select--wrapper form-field-select-wrapper no-label']")
    WebElement bestSellingElement;


    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyClickOnNew() {

        Utility.explicitWaitToBeClickable(clickOnNew);
    }

    public void clickAdultFoodProduct() {

        Utility.explicitWaitToBeClickable(clickAdultFoodImg);
    }

    public void checkScrollOnCartButton() {
        JavaScriptUtility.scrollToElement(prop.getProperty("argument"));
    }

    public void clickOnAddToCartButton() {
        Utility.explicitWaitToBeClickable(clickOnAddToCart);

    }

    public void clickTheCloseIcon() {
        Utility.explicitWaitToBeClickable(clickOnCloseIcon);
    }


    public String verifyProductPageText() {
        return Utility.PageTextFunctionality(productPageText);
    }


    public void clickOnNew() {                              //creating a method to click on web element
        Utility.explicitWaitToBeClickable(clickOnNew);

    }

    public void verifyScrollDown() {
        JavaScriptUtility.scrollToElement(prop.getProperty("argument"));
    }

    public void clickFeaturedBtn() {
        Utility.explicitWaitToBeClickable(clickFeaturedBtn);
    }

    public void clickDropDownElement() {
        Utility.dropDownFunctionality(clickFeaturedBtn);

    }
    public boolean checkTheBestsellingElement() {
        return Utility.verifyIsElementDisplayed(bestSellingElement);

    }

}




