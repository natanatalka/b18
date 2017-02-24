package pages;


import com.codeborne.selenide.SelenideElement;
import data.StopData;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.WaitPagesLoad;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.switchTo;

public class LoadsPage {

    private int countOfStops;
    public static int numberOfCreatedStop;

    private SelenideElement loadsTab(){
        return $(By.xpath("(.//*//a[contains(text(), 'Loads')])[1]"));
    }

    private SelenideElement LDNumber(String number){
        return $(By.xpath(".//*//a[contains(text(), '" + number + "')]"));
    }

    private SelenideElement stopsSubTab(){
        return $(By.xpath(".//*//a[contains(text(),'Stops')]"));
    }

    private SelenideElement addNewPickupButton(){
        return $(By.xpath(".//*//a[contains(text(),'Add new pickup')]"));
    }

    private SelenideElement addNewDropoffButton(){
        return $(By.xpath(".//*//a[contains(text(),'Add new dropoff')]"));
    }

    private SelenideElement saveButton(){
        return $(By.id("btn-save-"));
    }

    private SelenideElement deleteButton(int number){
        return $(By.id("btn-delete-" + number));
    }

    private int countOfExistingStops(){
        List<SelenideElement> stops = $$(By.xpath(".//*[@id='pickupsTabsContainer']/li"));
        return stops.size()-2;
    }

    private SelenideElement pickupButton(int number){
        return $(By.xpath(".//*//a[contains(text(),'PICKUP-" + number +"')]"));
    }

    private SelenideElement dropoffButton(int number){
        return $(By.xpath(".//*//a[contains(text(),'DROPOFF-" + number +"')]"));
    }

    public void navigateToLoadInfo(String loadNumber){
        loadsTab().click();
        LDNumber(loadNumber).click();
    }

    private SelenideElement companyName(){
        return $(By.id("companyNameInput"));
    }

    private SelenideElement scheduleTypeByAppointment(){
        return $(By.id("btn-appointment"));
    }

    private SelenideElement scheduleTypeFCFS(){
        return $(By.id("btn-appointment"));
    }

    private SelenideElement shipperNotes(){
        return $(By.id("shipperNotes"));
    }

    private SelenideElement stopDate(){
        return $(By.id("stopDate-"));
    }

    private SelenideElement appointmentTime(){
        return $(By.id("stopHours"));
    }

    private SelenideElement appointmentNumber(){
        return $(By.id("appointmentNo"));
    }

    private SelenideElement stopNumber(){
        return $(By.xpath("(.//*[@id='pickupCommodities']//input)[1]"));
    }

    private SelenideElement poNumber(){
        return $(By.xpath("(.//*[@id='pickupCommodities']//input)[2]"));
    }

    private SelenideElement commodity(){
        return $(By.xpath("(.//*[@id='pickupCommodities']//input)[3]"));
    }

    private SelenideElement unitType(){
        return $(By.xpath("(.//*[@id='pickupCommodities']//input)[4]"));
    }

    private SelenideElement unitCount(){
        return $(By.xpath("(.//*[@id='pickupCommodities']//input)[5]"));
    }

    private SelenideElement palletCount(){
        return $(By.xpath("(.//*[@id='pickupCommodities']//input)[3]"));
    }

    private SelenideElement weight(){
        return $(By.xpath("(.//*[@id='pickupCommodities']//input)[3]"));
    }

    private SelenideElement companyInstructionsNotes(){
        return $(By.id("company-instructions"));
    }


    public boolean verifyPickupIsCreated(){
        numberOfCreatedStop = countOfStops+1;
        return pickupButton(countOfStops+1).exists();
    }

    public boolean verifyDropoffIsCreated(){
        numberOfCreatedStop = countOfStops+1;
        return dropoffButton(countOfStops+1).exists();
    }


    public void navigateToStopsSubTab(){
        stopsSubTab().click();
        WaitPagesLoad.wait(10000);
        countOfStops = countOfExistingStops();
    }

    public void createEmptyPickUp(){
        navigateToStopsSubTab();
        addNewPickupButton().click();
        saveButton().click();
        Assert.assertTrue(verifyPickupIsCreated());
    }

    public void createEmptyDropOff(){
        navigateToStopsSubTab();
        addNewDropoffButton().click();
        saveButton().click();
        Assert.assertTrue(verifyDropoffIsCreated());
    }

    public void fillAllStopFields(StopData stopData){
        companyName().setValue(stopData.companyName);
        setScheduleType(stopData.scheduleType);
        stopDate().setValue(stopData.appointmentDate);

    }

    public void createFilledPickup(StopData stopData){
        navigateToStopsSubTab();
        addNewPickupButton().click();
        fillAllStopFields(stopData);
    }

    public void setScheduleType(String type){
        switch (type){
            case("byAppointment"): {
                scheduleTypeByAppointment().click();
                break;
            }
            case("FCFS"): {
                scheduleTypeFCFS().click();
                break;
            }
        }
    }

    public void openCreatedPickup( int number){
        pickupButton(number).click();
    }

    public void openCreatedDropoff(int number){
        dropoffButton(number).click();
    }

    public void deleteCreatedStop(String type, int number){
        switch (type) {
            case "pickup": {
                openCreatedPickup(number);
                deleteButton(number-1).click();
                break;
            }
            case "dropoff": {
                openCreatedDropoff(number);
                deleteButton(number-1).click();
                break;
            }
        }
    }

}
