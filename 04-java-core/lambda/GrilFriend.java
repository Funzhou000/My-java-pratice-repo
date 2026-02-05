package DataConstruture_algorithm.Algorithm_CourseWork;

public class GrilFriend {
    private String name;
    private int age;
    private double height;

    public GrilFriend() {
    }

    public GrilFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public GrilFriend name(String name) {
        setName(name);
        return this;
    }

    public GrilFriend age(int age) {
        setAge(age);
        return this;
    }

    public GrilFriend height(double height) {
        setHeight(height);
        return this;
    }

    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", height='" + getHeight() + "'" +
                "}";
    }
}
