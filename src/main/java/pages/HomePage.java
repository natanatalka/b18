package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utilities.WaitLoadPage;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement loginButton(){
        return $(By.xpath(".//*[@id='bs-example-navbar-collapse-1']//a[text()='Login']"));
    }

    private SelenideElement homeButton(){
        return $(By.xpath(".//*[@id='bs-example-navbar-collapse-1']//a[text()='Home']"));
    }

    public void clickOnLoginButton(){
        loginButton().click();
        WaitLoadPage.wait(2000);
    }
}
