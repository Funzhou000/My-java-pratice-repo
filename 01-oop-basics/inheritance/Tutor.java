package Adv_OOP.Demo07;

public class Tutor extends TeachingDepartment {
    String tutorClassroom;

    public Tutor() {

    }

    public Tutor(String id, String name, String teachingPermit, String tutorClassroom) {
        super(id, name, teachingPermit);
        this.tutorClassroom = tutorClassroom;
    }

    public String getTutorClassroom() {
        return tutorClassroom;
    }

    public void setTutorClassroom(String tutorClassroom) {
        this.tutorClassroom = tutorClassroom;
    }

    public void showTutorClass() {
        System.out.println("i'm tutor " + tutorClassroom);
    }
}
