package DataConstruture_algorithm.IO;

import java.io.Serializable;
import java.util.Objects;

public class testClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public testClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        testClass testClass = (testClass) o;
        return id == testClass.id &&
                Objects.equals(name, testClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "testClass [id=" + id + ", name=" + name + "]";
    }

}
