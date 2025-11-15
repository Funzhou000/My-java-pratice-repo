package Adv_OOP.Demo07;

public class test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("id", "LEE", "102086", "12");
        System.out.println(l.getTeachingPermit());
        System.out.println(l.getClassrom());
        l.showClass();
        l.showPermission();
        l.showIdCard();

    }
}
