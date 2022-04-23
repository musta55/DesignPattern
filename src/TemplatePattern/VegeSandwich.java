package TemplatePattern;

public class VegeSandwich extends  Sandwich{

    String [] vegUsed ={ "Lettuce","Tomatoes","Onions","Sweet Peppers"};
    String [] conused ={ "Oil","Vinegar"};


    boolean customerWantsMeat() {
        return false;
    }
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

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
