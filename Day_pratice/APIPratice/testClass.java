package APIPratice;

public class testClass implements Cloneable {
    int age;
    String name;
    public int[] data;

    public testClass() {
    }

    public testClass(int age, String name, int[] data) {
        this.age = age;
        this.name = name;
        this.data = data;
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

    public int[] getData() {
        return this.data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public testClass age(int age) {
        setAge(age);
        return this;
    }

    public testClass name(String name) {
        setName(name);
        return this;
    }

    public testClass data(int[] data) {
        setData(data);
        return this;
    }

    // @Override
    // public String toString() {
    // return "{" +
    // " age='" + getAge() + "'" +
    // ", name='" + getName() + "'" +
    // "}"+for (int i = 0; i < data.length; i++) {
    // System.out.print(data[i] + " ");
    // }
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        int[] data = this.data;
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        testClass t = (testClass) super.clone();
        t.data = newData;
        return t;
        // 如果需要深克隆，需要手动克隆每个引用类型的属性

    }

}
