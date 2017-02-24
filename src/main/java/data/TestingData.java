package data;

import utilities.DateUtilities;

import java.security.SecureRandom;
import java.util.Random;

public interface TestingData {


    Random rand = new Random();

    //MAIL DATA
    String URL = "https://b18developer:b18password@dev.bridge18.com";
    String ACCOUNT_NAME= "sonicfreight2015";
    String USERNAME = "nata_natka_natalka@outlook.com";
    String PASSWORD = "P@ssw0rd";
    String LD_NUMBER = "LD17020074";


    //STOP DATA
     String COMPANY_NAME = "Test_company";
     String SCHEDULE_TYPE = "FCFS";
     String APPOINTMENT_DATE = DateUtilities.addDaysToCurrentDate(5);
     String APPOINTMENT_TIME = "11:30";
     String APPOINTMENT_NUMBER = "APPOINTMENT-" + rand.nextInt(20);
     String STOP_NUMBER = "STOP-" + rand.nextInt(20);
     String PO_NUMBER = "NUMBER-" + rand.nextInt(20);
     String COMMODITY = "COMMODITY-" + rand.nextInt(40);
     String UNIT_TYPE = "TYPE-" + rand.nextInt(10);
     int UNIT_COUNT = rand.nextInt(50);
     int PALLET_COUNT = rand.nextInt(50);
     double WEIGHT = rand.nextDouble();
     String SHIPPER_NOTES = "SHIPPER NOTES NOTE NOT NO N";
     String NOTES = "NOTES NOTE NOT NO N";

}
