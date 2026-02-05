package DataConstruture_algorithm.Exception.ExceptionPratice1;

public class GrilFriends {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameFormatException {
        if (name.length() < 2 || name.length() > 5) {
            throw new NameFormatException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException {
        if (age < 14 || age > 25) {
            throw new RuntimeException();
        }
        this.age = age;
    }

}
