package tests;

import data.TestingData;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest implements TestingData {

    @Test
    public void loginSuccess(){
        open(URL);
        login(ACCOUNT_NAME,USERNAME,PASSWORD);
    }
}
