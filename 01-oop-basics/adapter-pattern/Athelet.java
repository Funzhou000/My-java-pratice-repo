package Adv_OOP.Demo11;

public class Athelet extends InterAdapter {
    int age;
    //继承 InterAdapter用到哪个方法重写哪个即可

    public Athelet() {
    }

    public Athelet(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Athelet age(int age) {
        setAge(age);
        return this;
    }

}
