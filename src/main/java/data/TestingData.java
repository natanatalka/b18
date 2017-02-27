package data;
import utilities.DateUtilities;
import java.util.Random;

public interface TestingData {


    Random rand = new Random();

    //LOGIN DATA
    String URL = "https://b18developer:b18password@dev.bridge18.com";
    String ACCOUNT_NAME= "sonicfreight2015";
    String USERNAME = "nata_natka_natalka@outlook.com";
    String PASSWORD = "P@ssw0rd";
    String LD_NUMBER = "LD17020074";



    String PICKUP = "pickup";
    String DROPOFF = "dropoff";


    //NEW STOP DATA
     String COMPANY_NAME = "Test_Toll Brothers";
     String SCHEDULE_TYPE = "First Come First Served";
     String APPOINTMENT_DATE = DateUtilities.addDaysToCurrentDate(5);
     String APPOINTMENT_TIME = "11:30";
     String APPOINTMENT_NUMBER = "APPOINTMENT-" + rand.nextInt(20);
     String STOP_NUMBER = "STOP-" + rand.nextInt(20);
     String PO_NUMBER = "NUMBER-" + rand.nextInt(20);
     String COMMODITY = "COMMODITY-" + rand.nextInt(40);
     String UNIT_TYPE = "TYPE-" + rand.nextInt(10);
     int UNIT_COUNT = rand.nextInt(50);
     int PALLET_COUNT = rand.nextInt(50);
     int WEIGHT = rand.nextInt(500);
     String SHIPPER_NOTES = "SHIPPER NOTES NOTE NOT NO N";
     String NOTES = "NOTES NOTE NOT NO N";

    //CHANGE COMMODITY
    String STOP_NUMBER_1 = "STOP_1-" + rand.nextInt(20);
    String PO_NUMBER_1 = "NUMBER_1-" + rand.nextInt(20);
    String COMMODITY_1 = "COMMODITY_1-" + rand.nextInt(40);
    String UNIT_TYPE_1 = "TYPE_1-" + rand.nextInt(10);
    int UNIT_COUNT_1 = rand.nextInt(50);
    int PALLET_COUNT_1 = rand.nextInt(50);
    int WEIGHT_1 = rand.nextInt(500);
}
