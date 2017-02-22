package tests;
import data.TestingData;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoadsTests extends BaseTest implements TestingData{

    @Test
    public void addNewEmptyPickup(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createPickUp();

    }
}
