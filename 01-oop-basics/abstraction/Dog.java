package Adv_OOP.Demo09;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("bones");

    }

    @Override
    public void swim() {
        System.out.println("Dog swimming");

    }
}
