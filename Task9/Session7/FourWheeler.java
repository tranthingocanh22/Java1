class FourWheeler extends Vehicle {
    private boolean powerSteer;
    public FourWheeler(String vId,String vName, int numWheels, boolean pSteer){
        vehicleNo=vId;
        vehicleName=vName;
        wheels=numWheels;
        powerSteer=pSteer;
    }
    public void showDetails(){
        System.out.println("Session7.Vehicle No: "+vehicleNo);
        System.out.println("Session7.Vehicle Name: "+vehicleName);
        System.out.println("Number of Wheels: "+wheels);
        if (powerSteer==true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }
    public class TestVehicle{
        public static void main(String[] args) {
            FourWheeler objFour = new FourWheeler("LA-09CS-1406","Volkswagen",4,true);
            objFour.showDetails();
            objFour.accelerate(200);
        }
    }
}