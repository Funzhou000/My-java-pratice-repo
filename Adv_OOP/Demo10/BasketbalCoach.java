package Adv_OOP.Demo10;

public class BasketbalCoach extends Coach {

    public BasketbalCoach() {
    }

    public BasketbalCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("i'm basketball coach");

    }

}
