package Adv_OOP.Demo07;

public class TeachingDepartment extends Employer {
    String teachingPermit;

    public TeachingDepartment() {

    }

    public TeachingDepartment(String id, String name, String teachingPermit) {
        super(id, name);
        this.teachingPermit = teachingPermit;
    }

    public void showL() {
        System.out.println("in this department we all hava great academic ");
    }

    public void showPermission() {
        System.out.println("my teaching permission ID is" + this.teachingPermit);
    }

    public String getTeachingPermit() {
        return teachingPermit;
    }

    public void setTeachingPermit(String teachingPermit) {
        this.teachingPermit = teachingPermit;
    }
}
