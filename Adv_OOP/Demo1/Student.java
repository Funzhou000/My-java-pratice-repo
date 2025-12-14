package Adv_OOP.Demo1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    int Grammer;
    int Math;
    int English;
    int age;
    String name;
    int studentId;

    public Student() {
    }

    public Student(int Grammer, int Math, int English, int age, String name) {
        this.Grammer = Grammer;
        this.Math = Math;
        this.English = English;
        this.age = age;
        this.name = name;
    }

    public Student(int studentId, String name) {
        this.name = name;
        this.studentId = studentId;
    }

    public int getGrammer() {
        return this.Grammer;
    }

    public void setGrammer(int Grammer) {
        this.Grammer = Grammer;
    }

    public int getMath() {
        return this.Math;
    }

    public void setMath(int Math) {
        this.Math = Math;
    }

    public int getEnglish() {
        return this.English;
    }

    public void setEnglish(int English) {
        this.English = English;
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

    public Student Grammer(int Grammer) {
        setGrammer(Grammer);
        return this;
    }

    public Student Math(int Math) {
        setMath(Math);
        return this;
    }

    public Student English(int English) {
        setEnglish(English);
        return this;
    }

    public Student age(int age) {
        setAge(age);
        return this;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " Grammer='" + getGrammer() + "'" +
                ", Math='" + getMath() + "'" +
                ", English='" + getEnglish() + "'" +
                ", age='" + getAge() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

    @Override
    public int compareTo(Student o) {
        int sum1 = this.Grammer + this.Math + this.English;
        int sum2 = o.Grammer + o.Math + o.English;
        int i = sum2 - sum1; // Descending order by total grades
        i = i == 0 ? this.Grammer - o.Grammer : i;
        i = i == 0 ? this.Math - o.Math : i;
        i = i == 0 ? this.English - o.English : i;
        i = i == 0 ? this.age - o.age : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
