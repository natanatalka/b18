package pages;


import com.codeborne.selenide.SelenideElement;
import data.StopData;
import data.TestingData;
import org.openqa.selenium.By;
import utilities.WaitPagesLoad;

import java.util.List;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoadsPage implements TestingData{

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

    private SelenideElement saveButton(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//button[@id='btn-save-']"));
    }

    private SelenideElement deleteButton(int number){
        return $(By.id("btn-delete-" + (number-1)));
    }

    private int countOfExistingStops(){
        List<SelenideElement> stops = $$(By.xpath(".//*[@id='pickupsTabsContainer']/li"));
        return stops.size()-2;
    }

    private SelenideElement stopButton(String stopType, int number){
        return $(By.xpath(".//*//a[contains(text(),'" + stopType.toUpperCase() + "-" + number +"')]"));
    }

    public void navigateToLoadInfo(String loadNumber){
        loadsTab().click();
        LDNumber(loadNumber).click();
    }

    private SelenideElement scheduleTypeByAppointment(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//button[@id='btn-appointment']"));
    }

    private SelenideElement scheduleTypeByAppointment(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//button[@id='btn-appointment']"));
    }

    private SelenideElement scheduleTypeFCFS(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//button[@id='btn-fcfs']"));
    }

    private SelenideElement scheduleTypeFCFS(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//button[@id='btn-fcfs']"));
    }

    private SelenideElement companyName(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@id='companyNameInput']"));
    }

    private SelenideElement companyName(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@id='companyNameInput']"));
    }

    private SelenideElement shipperNotes(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//textarea[@id='shipperNotes']"));
    }

    private SelenideElement shipperNotes(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//textarea[@id='shipperNotes']"));
    }

    private SelenideElement appointmentDate(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='pickupTime']"));
    }
    private SelenideElement appointmentDate(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='pickupTime']"));
    }

    private SelenideElement appointmentTime(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@id='stopHours']"));
    }

    private SelenideElement appointmentTime(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@id='stopHours']"));
    }

    private SelenideElement appointmentNumber(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@id='appointmentNo']"));
    }

    private SelenideElement appointmentNumber(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number - 1) + "']//input[@id='appointmentNo']"));
    }

    private SelenideElement stopNumber(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='pickupNumber']"));
    }

    private SelenideElement stopNumber(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='pickupNumber']"));
    }

    private SelenideElement poNumber(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='poNumber']"));
    }

    private SelenideElement poNumber(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='poNumber']"));
    }

    private SelenideElement commodity(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='commodity']"));
    }

    private SelenideElement commodity(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='commodity']"));
    }

    private SelenideElement unitType(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='unitType']"));
    }

    private SelenideElement unitType(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='unitType']"));
    }

    private SelenideElement unitCount(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='unitCount']"));
    }

    private SelenideElement unitCount(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='unitCount']"));
    }

    private SelenideElement palletCount(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='palletCount']"));
    }

    private SelenideElement palletCount(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='palletCount']"));
    }

    private SelenideElement weight(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//input[@data-field='weight']"));
    }

    private SelenideElement weight(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//input[@data-field='weight']"));
    }

    private SelenideElement companyInstructions(String stopType){
        return $(By.xpath(".//*//div[@id='add-new-" + stopType + "']//textarea[@id='company-instructions']"));
    }

    private SelenideElement companyInstructions(int number){
        return $(By.xpath(".//*//fieldset[@id='stop-" + (number-1) + "']//textarea[@id='company-instructions']"));
    }

    private SelenideElement companyNameFromDropdown(String name){
        return $(By.xpath(".//*//li[contains(text(), '" + name + "')]"));
    }

    public void setCompany(String companyName, String stopType){
        companyName(stopType).setValue(companyName);
        companyNameFromDropdown(companyName).click();
    }

        public void setScheduleType(String stopType, String scheduleType) {
            switch (stopType) {
                case (PICKUP): {
                    switch (scheduleType) {
                        case ("byAppointment"): {
                            scheduleTypeByAppointment(PICKUP).click();
                            break;
                        }
                        case ("FCFS"): {
                            scheduleTypeFCFS(PICKUP).click();
                            break;
                        }
                    }
                    break;
                }
                case (DROPOFF): {
                    switch (scheduleType) {
                        case ("byAppointment"): {
                            scheduleTypeByAppointment(DROPOFF).click();
                            break;
                        }
                        case ("FCFS"): {
                            scheduleTypeFCFS(DROPOFF).click();
                            break;
                        }
                    }
                    break;
                }
            }
        }

    public void setNumberOfCreatedStop(){
        numberOfCreatedStop = countOfStops+1;
    }
    public boolean verifyDropoffIsPresent(){
        return stopButton(DROPOFF, countOfStops+1).exists();
    }

    public boolean verifyPickupIsPresent(){
        return stopButton(PICKUP, countOfStops+1).exists();
    }


    public void navigateToStopsSubTab(){
        stopsSubTab().click();
        WaitPagesLoad.wait(10000);
        countOfStops = countOfExistingStops();
    }

    public void createEmptyPickUp(){
        navigateToStopsSubTab();
        addNewPickupButton().click();
        saveButton(PICKUP).click();
        setNumberOfCreatedStop();
    }

    public void createEmptyDropOff(){
        navigateToStopsSubTab();
        addNewDropoffButton().click();
        saveButton(DROPOFF).click();
        setNumberOfCreatedStop();
    }

    public void fillAllNewStopFields(String stopType, StopData stopData){
        setCompany(stopData.companyName, stopType);
        setScheduleType(stopType, stopData.scheduleType);
        shipperNotes(stopType).setValue(stopData.shipperNotes);
        appointmentDate(stopType).setValue(stopData.appointmentDate);
        appointmentTime(stopType).setValue(stopData.appointmentTime);
        appointmentNumber(stopType).setValue(stopData.appointmentNumber);
        stopNumber(stopType).setValue(stopData.stopNumber);
        poNumber(stopType).setValue(stopData.poNumber);
        commodity(stopType).setValue(stopData.commodity);
        unitType(stopType).setValue(stopData.unitType);
        unitCount(stopType).setValue(Integer.toString(stopData.unitCount));
        palletCount(stopType).setValue(Integer.toString(stopData.palletCount));
        weight(stopType).setValue(Double.toString(stopData.weight));
        companyInstructions(stopType).setValue(stopData.notes);
    }

    public void createFilledPickup(StopData stopData){
        navigateToStopsSubTab();
        addNewPickupButton().click();
        fillAllNewStopFields(PICKUP, stopData);
        saveButton(PICKUP).click();
        setNumberOfCreatedStop();
    }

    public void createFilledDropoff(StopData stopData){
        navigateToStopsSubTab();
        addNewDropoffButton().click();
        fillAllNewStopFields(DROPOFF, stopData);
        saveButton(DROPOFF).click();
        setNumberOfCreatedStop();
    }

    public void openCreatedPickup(int number){
        stopButton(PICKUP, number).click();
    }

    public void openCreatedDropoff(int number){
        stopButton(DROPOFF ,number).click();
    }

    public void deleteCreatedStop(String type, int number){
        switch (type) {
            case PICKUP: {
                openCreatedPickup(number);
                deleteButton(number).click();
                break;
            }
            case DROPOFF: {
                openCreatedDropoff(number);
                deleteButton(number).click();
                break;
            }
        }
    }

    public boolean verifyPickupInfo(StopData stopData){
        openCreatedPickup(numberOfCreatedStop);
        return (checkAllStopFieldsAreCorrect(numberOfCreatedStop, stopData));
    }

    public boolean verifyDropoffInfo(StopData stopData){
        openCreatedDropoff(numberOfCreatedStop);
        return (checkAllStopFieldsAreCorrect(numberOfCreatedStop, stopData));
    }

    public boolean checkAllStopFieldsAreCorrect(int stopNumber, StopData stopData){
        return verifyField(companyName(stopNumber), stopData.companyName) &&
                verifyField(shipperNotes(stopNumber), stopData.shipperNotes) &&
                verifyField(appointmentDate(stopNumber), stopData.appointmentDate) &&
                verifyField(appointmentTime(stopNumber), stopData.appointmentTime) &&
                verifyField(appointmentNumber(stopNumber), stopData.appointmentNumber) &&
                verifyField(stopNumber(stopNumber), stopData.stopNumber) &&
                verifyField(poNumber(stopNumber), stopData.poNumber) &&
                verifyField(commodity(stopNumber), stopData.commodity) &&
                verifyField(unitType(stopNumber), stopData.unitType) &&
                verifyField(unitCount(stopNumber), Integer.toString(stopData.unitCount)) &&
                verifyField(palletCount(stopNumber), Integer.toString(stopData.palletCount)) &&
                verifyField(weight(stopNumber), Integer.toString(stopData.weight));
    }

    public boolean verifyField(SelenideElement element, String expectedValue){
        return element.has(value(expectedValue));
    }

    public boolean verifyDropoffIsDeleted() {
        return  verifyDropoffIsPresent();
    }

    public boolean verifyPickupIsDeleted(){
        return  verifyPickupIsPresent();
    }
}
