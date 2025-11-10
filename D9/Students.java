package D9;

public class Students {
    int stdid;
    String name;
    int age;

    public Students() {

    }

    public Students(int stdid, String name, int age) {
        this.stdid = stdid;
        this.name = name;
        this.age = age;
    }

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
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

}
