package DecoratorPattern;


public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Souce");



    }
    public String getDescription() {
        return tempPizza.getDescription() +", Tomato Sauce";
    }

    public double getCost() {
        return tempPizza.getCost()+0.35;
    }
}

