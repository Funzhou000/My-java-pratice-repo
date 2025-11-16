package Adv_OOP.Demo08;

public class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String somethings) {
        System.out.println("dog is eating" + somethings);
    }

    public void lookHome() {
        System.out.println("dog is looking home");
    }
}
