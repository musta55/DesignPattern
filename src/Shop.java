public class Shop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOs("Windows").setProcessor("Octa core").getPhone();
        System.out.println(p.toString());
    }
}

//Builder pattern is used when you want to pass constructor as parameter

