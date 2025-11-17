package Adv_OOP.Demo06;

public class Cook extends Employee {

    public Cook() {

    }

    public Cook(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        
        System.out.println("Cook meal");
    }

}
