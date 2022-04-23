package DecoratorPattern;

public class PizzaMaker {
    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarrella(new PlainPizza()));

        System.out.println(
                "Ingredients " + basicPizza.getDescription()
        );

        System.out.println(
                "Cost " + basicPizza.getCost()
        );

    }
}
