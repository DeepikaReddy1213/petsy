package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ProductPage;
import testbase.WebTestBase;

public class ProductTest extends WebTestBase {

    public ProductPage productPage;
    public SoftAssert softAssert;

    ProductTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        productPage = new ProductPage();
    }

    @Test(priority = 1, description = "verify Product Page functionality")
    public void verifyProductPageOptions() {
        softAssert = new SoftAssert();
        productPage.verifyClickOnNew();
        productPage.verifyProductPageText();
        softAssert.assertEquals(productPage.verifyProductPageText(), "New Products", "text should be match");
        productPage.clickAdultFoodProduct();
        productPage.checkScrollOnCartButton();
        productPage.clickOnAddToCartButton();
        productPage.clickTheCloseIcon();
        softAssert.assertAll();
    }

    @Test(priority = 2, description = "verify DropDown Method")
    public void verifyDropDownPageOptions() {
        softAssert = new SoftAssert();
        productPage.clickOnNew();
        productPage.verifyScrollDown();
        productPage.clickFeaturedBtn();
        productPage.clickDropDownElement();
        productPage.checkTheBestsellingElement();
        softAssert.assertTrue(productPage.checkTheBestsellingElement(),"Best selling Element is displayed");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }

}
