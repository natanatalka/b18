package tests;
import data.StopData;
import data.TestingData;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoadsTests extends BaseTest implements TestingData{

    public static StopData filledStop = new StopData(
            COMPANY_NAME, SCHEDULE_TYPE, APPOINTMENT_DATE, APPOINTMENT_TIME, APPOINTMENT_NUMBER, STOP_NUMBER, PO_NUMBER, COMMODITY,
            UNIT_TYPE, UNIT_COUNT, PALLET_COUNT, WEIGHT, SHIPPER_NOTES, NOTES);

    public static StopData onlyCommodity = new StopData(
            STOP_NUMBER_1, PO_NUMBER_1, COMMODITY_1, UNIT_TYPE_1, UNIT_COUNT_1, PALLET_COUNT_1, WEIGHT_1);

    @Test
    public void addNewEmptyPickup(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createEmptyPickUp();
        Assert.assertTrue(loadsPage.verifyPickupIsPresent());
        loadsPage.deleteCreatedStop(PICKUP, loadsPage.numberOfCreatedStop);
    }

    @Test
    public void addNewEmptyDropoff(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createEmptyDropOff();
        Assert.assertTrue(loadsPage.verifyDropoffIsPresent());
        loadsPage.deleteCreatedStop(DROPOFF, loadsPage.numberOfCreatedStop);
    }

    @Test
    public void addNewFilledPickup(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createFilledPickup(filledStop);
        Assert.assertTrue(loadsPage.verifyPickupInfo(filledStop));
        loadsPage.deleteCreatedStop(PICKUP, loadsPage.numberOfCreatedStop);
    }

    @Test
    public void addNewFilledDropoff(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createFilledDropoff(filledStop);
        Assert.assertTrue(loadsPage.verifyDropoffInfo(filledStop));
        loadsPage.deleteCreatedStop(DROPOFF, loadsPage.numberOfCreatedStop);
    }

    @Test
    public void deletePickup(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createEmptyPickUp();
        loadsPage.deleteCreatedStop(PICKUP, loadsPage.numberOfCreatedStop);
        Assert.assertTrue(loadsPage.verifyPickupIsDeleted());
    }

    @Test
    public void deleteDropoff(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createEmptyDropOff();
        loadsPage.deleteCreatedStop(DROPOFF, loadsPage.numberOfCreatedStop);
        Assert.assertTrue(loadsPage.verifyDropoffIsDeleted());
    }

    @Test
    public void editPickupInfo(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createFilledPickup(filledStop);
        loadsPage.editPickupCommmodity(loadsPage.numberOfCreatedStop, onlyCommodity);
        Assert.assertTrue(loadsPage.verifyPickupChangedInfo(onlyCommodity));
    }

    @Test
    public void editDropoffInfo(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createFilledDropoff(filledStop);
        loadsPage.editDropoffCommmodity(loadsPage.numberOfCreatedStop, onlyCommodity);
        Assert.assertTrue(loadsPage.verifyDropoffChangedInfo(onlyCommodity));
    }

}
