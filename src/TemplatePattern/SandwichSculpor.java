package TemplatePattern;

public class SandwichSculpor {

    public static void main(String[] args) {
        Sandwich cust12Sandwich =new ItalianSandwich();

        cust12Sandwich.makeSandwich();

        Sandwich cust22Sandwich =new VegeSandwich();

        cust22Sandwich.makeSandwich();
    }
}
