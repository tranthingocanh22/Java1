public class Ex2_Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public Ex2_Vehicle(String vId, String vName, int numWheels){
        vehicleNo = vId;
        vehicleName=vName;
        wheels = numWheels;
    }
    public void accelerate(int speed){
        System.out.println("Accelerating at: "+speed+" kmph");
    }
}
