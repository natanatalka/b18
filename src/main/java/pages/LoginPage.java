package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitLoadPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement accountNameInput(){
        return $(By.id("login_accountName"));
    }

    private SelenideElement emailInput(){
        return $(By.id("login_emailAddress"));
    }

    private SelenideElement passwordInput(){
        return $(By.id("login_password"));
    }

    private SelenideElement loginButton(){
        return $(By.id("btn_step1Next"));
    }

    private SelenideElement dashboard(){
        return $(By.xpath(".//*[@id='main']//h1"));
    }


    public void setLoginData(String accountName, String email, String password){
        accountNameInput().setValue(accountName);
        emailInput().setValue(email);
        passwordInput().setValue(password);
    }

    public void clickOnLoginButton(){
        loginButton().click();
        WaitLoadPage.wait(2000);
    }

    public boolean verifySuccessLogin(){
        return dashboard().has(text("Dashboard"));
    }
}
