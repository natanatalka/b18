package tests;


import pages.LoginPage;
import setup.SetupDriver;

public class BaseTest extends SetupDriver {

    public void login(String account, String email, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.setLoginData(account, email, password);
        loginPage.clickOnLoginButton();
    }
}
