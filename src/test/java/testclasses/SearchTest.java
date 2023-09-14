package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SearchPage;
import testbase.WebTestBase;

public class SearchTest extends WebTestBase {

    public SearchPage searchPage;
    public SoftAssert softAssert;

    SearchTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        searchPage = new SearchPage();
    }


    @Test(priority = 2, description = "verify Search Text Box")
    public void verifySearchPage() {
        softAssert = new SoftAssert();
        searchPage.clickSearchBox(prop.getProperty("productName"));
        searchPage.clickSearchIcon();
        searchPage.verifyPageTitle();
        softAssert.assertEquals(searchPage.verifyPageTitle(),"search result","text should match");
        softAssert.assertAll();
    }

    @Test(priority = 1, description = "verify Check Box functionality")
    public void verifyCheckBoxFunctionality() {
        softAssert = new SoftAssert();
        searchPage.clickSearchIcon();
        searchPage.clickBrandCheckBox();
        searchPage.checkBoxFunctionality();
        softAssert.assertTrue(searchPage.checkBoxFunctionality(), "Should be clickable");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }
}
