package Adv_OOP.Demo08;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getColor() + "的" + d.getAge() + "岁狗");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getColor() + "的" + c.getAge() + "岁猫");
            c.eat(something);
        }

    }
}
