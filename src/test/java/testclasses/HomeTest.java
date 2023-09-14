package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

import java.io.IOException;

public class HomeTest extends WebTestBase {

    public HomePage homePage;
    public SoftAssert softAssert;

    HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() throws IOException {
        initialization();
        homePage = new HomePage();
    }


    @Test(priority = 1,description = "verify get window handle functionality")
    public void verifyFaceBookLog() throws InterruptedException {
        softAssert = new SoftAssert();
        homePage.clickOnFacebookLogo();
        softAssert.assertEquals(homePage.getTheCurrentPageUrl(), "https://www.petsy.online/", "url should be match");
        softAssert.assertAll();

    }


    @Test(priority = 2,description = "verify Keyboard And Mouse Based Actions")
    public void verifyKeyBoardBaseActions() {
        softAssert = new SoftAssert();
        homePage.checkMouseOverOnCats();
        homePage.clickOnCatsFoodAndTreats();
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }

}

