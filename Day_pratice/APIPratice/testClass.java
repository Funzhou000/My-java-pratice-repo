package APIPratice;

public class testClass {
    int age;
    String name;

    public testClass() {
    }

    public testClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public testClass age(int age) {
        setAge(age);
        return this;
    }

    public testClass name(String name) {
        setName(name);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " age='" + getAge() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
    if (this == obj)
    return true;
    if (obj == null)
    return false;
    if (getClass() != obj.getClass())
    return false;
    testClass other = (testClass) obj;
    if (age != other.age)
    return false;
    if (name == null) {
    if (other.name != null)
    return false;
    } else if (!name.equals(other.name))
    return false;
    return true;
    }

}
