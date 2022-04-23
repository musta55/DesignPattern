package TemplatePattern;

public class ItalianSandwich extends  Sandwich{

        String [] meatUsed ={ "Salami","Pepperani","Capicola Ham"};
    String [] cheeseUsed ={ "Provolone"};
    String [] vegUsed ={ "Lettuce","Tomatoes","Onions","Sweet Peppers"};
    String [] conused ={ "Oil","Vinegar"};


    public void cutBun(){
        System.out.println("The sandwich is cut");
    }

    @Override
    void addMeat() {
        System.out.println("Adding the Meat: "  );
        for(String meat:meatUsed) {
            System.out.println(meat +" ");
        }
    }

    @Override
    void addCheese() {
        System.out.println("Adding the Cheese: "  );
        for(String cheese:cheeseUsed) {
            System.out.println(cheese +" ");
        }
    }

    @Override
    void addVeg() {
        System.out.println("Adding the Vegetables: "  );
        for(String veg:vegUsed) {
            System.out.println(veg +" ");
        }
    }

    @Override
    void addCon() {
        System.out.println("Adding the Condiments: "  );
        for(String con:conused) {
            System.out.println(con +" ");
        }
    }
}
