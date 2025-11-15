package Adv_OOP.Demo06;

public class Manager extends Employee {
    private int bonus;

    public Manager() {

    }

    public Manager(int id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("manage other");
    }

}
