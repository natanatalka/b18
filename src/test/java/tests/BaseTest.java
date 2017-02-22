package tests;


import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import pages.HomePage;
import pages.LoadsPage;
import pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.SetupDriver;
import utilities.WaitLoadPage;


public class BaseTest extends SetupDriver {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LoadsPage loadsPage = new LoadsPage();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    public void login(String account, String email, String password){
        homePage.clickOnLoginButton();
        loginPage.setLoginData(account, email, password);
        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.verifySuccessLogin());
        LOGGER.info("logged in as " + email);
    }

}
