package BuilderPattern;

import java.util.Scanner;

/*
 *  Customer who is in hotel and customer can place order to
 *  HotelWaiter or Servant.
 */
public class BuilderClient
{
    public static void main( String[] args )
    {
        System.out.println("What do you want to Build? (1.Tea)/ (2.Coffee)");
        Scanner input = new Scanner(System.in);
        int inputBuild=input.nextInt();
        if(inputBuild==1){
            Beverage tea = HotelWaiter.takeOrder("tea");
            System.out.println(tea);
        }

else if(inputBuild==2){
            Beverage coffee = HotelWaiter.takeOrder("coffee");
            System.out.println(coffee);
        }
else {
            System.out.println("Invalid Input");
        }

    }
}