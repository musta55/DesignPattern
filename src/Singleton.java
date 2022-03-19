public class Singleton {
    public static void main(String[] args) {
        Abc obj1=Abc.getInstance();
        Abc obj2=Abc.getInstance();


    }
}
 class Abc{
    //step 1: create a static object so that this object will become  a global variable
    public  static Abc obj;   // Eager -> lazy
    int i;
    //Step 2: Make default constructor private
    private Abc(){
        System.out.println("Instance created");
    }
    //Step 3: Create a static getInstance method
    public static Abc getInstance() {

        if(obj==null){
            obj =new Abc();
        }

        return  obj;
    }
}
// You are allowing to create a single instance of a class.That is one object can be breated once