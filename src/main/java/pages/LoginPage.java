package pages;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitLoadPage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    SelenideElement accountNameInput(){
        return $(By.id("login_accountName"));
    }

    SelenideElement emailIput(){
        return $(By.id("login_emailAddress"));
    }

    SelenideElement passwordInput(){
        return $(By.id("login_password"));
    }

    SelenideElement loginButton(){
        return $(By.id("btn_step1Next"));
    }

    public void setLoginData(String accountName, String email, String password){
        accountNameInput().setValue(accountName);
        emailIput().setValue(email);
        passwordInput().setValue(password);
    }

    public void clickOnLoginButton(){
        loginButton().click();
        WaitLoadPage.wait(3000);
    }

    public void verifySuccessLogin(){

    }
}
