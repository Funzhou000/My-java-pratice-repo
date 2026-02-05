package Adv_OOP.Demo09;

public class rabiit extends Animal {

    public rabiit() {
    }

    public rabiit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("carrot");

    }

}
