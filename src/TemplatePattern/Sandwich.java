package TemplatePattern;

public abstract class Sandwich {

    boolean afterFirstCondiment =false;

    final void  makeSandwich() {
        cutBun();

        if(customerWantsMeat()) {
            addMeat();
            afterFirstCondiment=true;
        }

        if(customerWantsCondiments()) {
            addCon();

        }

        if(customerWantsVeg()) {
            if(afterFirstCondiment)  {
                System.out.println("\n");

            }
            addVeg();

        }
        if(customerWantsCheese()) {
           if(afterFirstCondiment)  {
               System.out.println("\n");

           }
            addCheese();

        }

        wrapTheSandwich();
    }

    public void cutBun() {
        System.out.println("The sandwich is Cut");
    }
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVeg();
    abstract void addCon();


    boolean customerWantsMeat() {
        return true;
    }
    boolean customerWantsCheese() {
        return true;
    }
    boolean customerWantsVeg() {
        return true;
    }
    boolean customerWantsCondiments() {
        return true;
    }

    public void wrapTheSandwich() {
        System.out.println("Wrap the sandwich");
    }

}
