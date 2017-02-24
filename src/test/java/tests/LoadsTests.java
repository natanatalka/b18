package tests;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import data.StopData;
import data.TestingData;
import org.junit.Test;
import org.junit.runner.RunWith;
import utilities.DateUtilities;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

@RunWith(DataProviderRunner.class)
public class LoadsTests extends BaseTest implements TestingData{

    public static StopData filledPickUp = new StopData(
            COMPANY_NAME, SCHEDULE_TYPE, APPOINTMENT_DATE, APPOINTMENT_TIME, APPOINTMENT_NUMBER, STOP_NUMBER, PO_NUMBER, COMMODITY,
            UNIT_TYPE, UNIT_COUNT, PALLET_COUNT, WEIGHT, SHIPPER_NOTES, NOTES);

    @Test
    public void addNewEmptyPickup(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createEmptyPickUp();
        loadsPage.deleteCreatedStop("pickup", loadsPage.numberOfCreatedStop);
    }

    //TODO fix fucking test
    @Test
    public void addNewEmptyDropoff(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createEmptyDropOff();
        loadsPage.deleteCreatedStop("dropoff", loadsPage.numberOfCreatedStop);
    }

    @Test
    public void addNewFilledPickup(){
        open(URL);
        login(ACCOUNT_NAME, USERNAME, PASSWORD);
        loadsPage.navigateToLoadInfo(LD_NUMBER);
        loadsPage.createFilledPickup(filledPickUp);
    }
}
