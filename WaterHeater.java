import java.util.*;


public class WaterHeater extends ServiceCall {

    private int age;
    private Date serviceRequested;

    public WaterHeater(String serviceAddress, String problemDescription, Date serviceRequested, Date resolvedDate, int age) {

        super(serviceAddress, problemDescription, resolvedDate);

        this.age = age;
        this.serviceRequested = serviceRequested;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getServiceRequested() {
        return serviceRequested;
    }

    public void setServiceRequested(Date serviceRequested) {
        this.serviceRequested = serviceRequested;
    }

    public String toString() {

        Integer ageInt = age;
        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + 20);

        return "Water Heater Service Call " + "\n" +
                "Age of Water Heater: " + age + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription + "\n" +
                "Service Requested = " + serviceRequested + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee + $20 City Fee = " + feeString;


    }
}



