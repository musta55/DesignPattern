package DecoratorPattern;

public class Mozzarrella extends ToppingDecorator{
    public Mozzarrella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Moz");


    }
    public String getDescription() {
        return tempPizza.getDescription() +", Mozzarella";
    }

    public double getCost() {
        return tempPizza.getCost()+0.50;
    }
}

