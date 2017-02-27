package data;

public class StopData {

    public String companyName;
    public String scheduleType;
    public String appointmentDate;
    public String appointmentTime;
    public String appointmentNumber;
    public String stopNumber;
    public String poNumber;
    public String commodity;
    public String unitType;
    public int unitCount;
    public int palletCount;
    public int weight;
    public String shipperNotes;
    public String notes;

    public StopData(String companyName, String scheduleType, String appointmentDate, String appointmentTime, String appointmentNumber, String stopNumber, String poNumber, String commodity,
                    String unitType, int unitCount, int palletCount, int weight, String shipperNotes, String notes){
        this.companyName = companyName;
        this.scheduleType = scheduleType;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentNumber = appointmentNumber;
        this.stopNumber = stopNumber;
        this.poNumber = poNumber;
        this.commodity = commodity;
        this.unitType = unitType;
        this.unitCount = unitCount;
        this.palletCount = palletCount;
        this.weight = weight;
        this.shipperNotes = shipperNotes;
        this.notes = notes;
    }

    public StopData() {

    }
}