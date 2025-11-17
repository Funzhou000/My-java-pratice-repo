package Adv_OOP.Demo09;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(final String name, final int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("bug");

    }

    @Override
    public void swim() {
        System.out.println("frog swimming");

    }

}
