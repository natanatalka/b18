package tests;


import pages.HomePage;
import pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import setup.SetupDriver;


public class BaseTest extends SetupDriver {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    public void login(String account, String email, String password){
        homePage.clickOnLoginButton();
        loginPage.setLoginData(account, email, password);
        loginPage.clickOnLoginButton();

        LOGGER.info("logged in as " + email);
    }
}
