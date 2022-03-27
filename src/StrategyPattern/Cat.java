package StrategyPattern;

public class Cat extends Animal{

    public Cat(String name, double height, double weight, String favFood, double speed, String sound) {
        super(name, height, weight, favFood, speed, sound);
        setSound("Meaw");
        flyingType =new CantFly();
    }
}
