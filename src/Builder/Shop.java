package Builder;

public class Shop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOs("Factory.Windows").setProcessor("Octa core").setRam(7).getPhone();
        System.out.println(p.toString());
    }
}

//Builder pattern is used when you have multiple constructor in parameter

