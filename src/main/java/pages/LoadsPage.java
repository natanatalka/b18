package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoadsPage {

    private SelenideElement loadsTab(){
        return $(By.xpath("(.//*//a[contains(text(), 'Loads')])[1]"));
    }

    private SelenideElement LDNumber(String number){
        return $(By.xpath(".//*//a[contains(text(), '" + number + "')]"));
    }

    private SelenideElement stopsSubTab(){
        return $(By.xpath(".//*//a[contains(text(),'Stops')]"));
    }

    private List<SelenideElement> allStops(){
        return $$(By.xpath(".//*//a[contains(text(),'PICKUP-') OR contains(text(),'DROPOFF-')]"));
    }

    private SelenideElement addNewPickupButton(){
        return $(By.xpath(".//*//a[contains(text(),'Add new pickup')]"));
    }

    private SelenideElement saveButton(){
        return $(By.id("btn-save-"));
    }

    //TODO calculate amount of existing stops before creating new
    private int countOfExistingStops(){
        List<SelenideElement> stops = $$(By.xpath(".//*[@id='pickupsTabsContainer']/li"));
        return stops.size()-2;
    }

    private SelenideElement pickupButton(int number){
        return $(By.xpath(".//*//a[contains(text(),'PICKUP-" + number +"')]"));
    }

    public void navigateToLoadInfo(String loadNumber){
        loadsTab().click();
        LDNumber(loadNumber).click();
    }

    public boolean verifyPickupIsCreated(){
        return pickupButton(countOfExistingStops()+1).exists();
    }

    public void createPickUp(){
        stopsSubTab().click();
        addNewPickupButton().click();
        saveButton().click();
        Assert.assertTrue(verifyPickupIsCreated());
    }



}
