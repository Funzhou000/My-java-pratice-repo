package Adv_OOP.Demo06;

public class test {
    public static void main(String[] args) {
        Cook c = new Cook(123, "Alice", 7000);
        c.work();
        Manager m = new Manager();
        m.setBonus(0);
        m.setName("lee");
        m.setId(345678);
        m.work();
        System.out.println(m.getName());

    }
}
