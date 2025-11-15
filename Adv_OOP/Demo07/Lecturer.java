package Adv_OOP.Demo07;

public class Lecturer extends TeachingDepartment {
    String classrom;

    public Lecturer() {

    }

    public Lecturer(String id, String name, String teachingPermit, String classroom) {
        super(id, name, teachingPermit);
        this.classrom = classroom;
    }

    public void showClass() {
        System.out.println("i'm teaching " + classrom);
    }

    public String getClassrom() {
        return classrom;
    }

    public void setClassrom(String classrom) {
        this.classrom = classrom;
    }

}