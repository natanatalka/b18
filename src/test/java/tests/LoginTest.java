package tests;

import data.TestingData;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import setup.SetupDriver;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest implements TestingData {

    @Test
    public void loginSuccess(){
        HomePage homePage = new HomePage();
        open(URL);
        homePage.clickOnLoginButton();
        login(ACCOUNT_NAME,USERNAME,PASSWORD);
    }
}
