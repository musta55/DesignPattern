package Singleton;

/**
 public class Singleton.Singleton {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.Abc obj=Singleton.Abc.getInstance();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.Abc obj=Singleton.Abc.getInstance();
            }
        });

            t1.start();
            try{
                Thread.sleep(10);
            }catch (Exception e){

            }
            t2.start();

    }
}

//enum - Java 1.5
class Singleton.Abc{
    //step 1: create a static object so that this object will become  a global variable
    public  static Singleton.Abc obj;   // Eager -> lazy
    //Step 2: Make default constructor private
    private Singleton.Abc(){
        System.out.println("Instance created");
    }
    //Step 3: Create a static getInstance method
    public static  Singleton.Abc getInstance() {      //Double checked locking

        if(obj==null){
            synchronized ( Singleton.Abc.class){
                if(obj==null)obj =new Singleton.Abc();
            }

        }

        return  obj;
    }
}**/
// You are allowing to create a single instance of a class.That is one object can be breated once

// Singleton.Singleton pattern using Enum (Best approach)

public class Singleton{
    public static void main(String[] args) {
        Abc obj1= Abc.INSTANCE;
        obj1.i =5;
        obj1.show();

        Abc obj2=Abc.INSTANCE;
        obj2.i=6;
        obj1.show();
    }
}


enum Abc{  //Special type of class
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}