package Factory;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf=new OperatingSystemFactory();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Operating system type (Open/Closed)");

        String userName = myObj.nextLine();

            OS obj =osf.getInstance(userName);
            obj.spec();

    }
}
