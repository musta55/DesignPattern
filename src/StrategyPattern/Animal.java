package StrategyPattern;

public class Animal {
    private String name;
    private double height;
    private double weight;
    private String favFood;
    private double speed;
    private String sound;

    public Animal(String name, double height, double weight, String favFood, double speed, String sound) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.favFood = favFood;
        this.speed = speed;
        this.sound = sound;
    }
    public Flys flyingType;         //composition

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<0) System.out.println("Weight must be bigger than 0");
        else{
            this.weight = weight;
        }

    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        flyingType =newFlyType;
    }


}
