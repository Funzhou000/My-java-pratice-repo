package Adv_OOP.Demo08;

public class test {
    public static void main(String[] args) {
        Cat c = new Cat(1, "brown");
        Person p = new Person("wang", 30);
        p.keepPet(c, "fish");
    }
}
