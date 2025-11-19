package Adv_OOP.Demo14;

public class AnonymousInnrtClass {
    public static void main(String[] args) {
        // new Frog() {

        // @Override
        // public void swim() {
        // // TODO Auto-generated method stub
        // System.out.println("青蛙在游泳");
        // }

        // }.swim();
        // Lambda expression
        Frog f = () -> {
            System.out.println("Frog is swimming");
        };
        f.swim();
    }
}
