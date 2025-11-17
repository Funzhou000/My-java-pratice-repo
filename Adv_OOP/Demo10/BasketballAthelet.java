package Adv_OOP.Demo10;

public class BasketballAthelet extends Athlete {

    public BasketballAthelet() {
    }

    public BasketballAthelet(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("learning play basketball");

    }

}
