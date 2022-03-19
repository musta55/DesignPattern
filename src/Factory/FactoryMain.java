package Factory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf=new OperatingSystemFactory();
        OS obj =osf.getInstance("Closed");
        obj.spec();
        //If updates it will not change the client application
    }
}
