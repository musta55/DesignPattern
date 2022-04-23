package DecoratorPattern;

public abstract class ToppingDecorator implements  Pizza{
    protected Pizza tempPizza; //composition
    public ToppingDecorator(Pizza newPizza) {

        tempPizza=newPizza;

    }
    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
}
