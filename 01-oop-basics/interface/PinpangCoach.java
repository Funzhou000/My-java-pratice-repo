package Adv_OOP.Demo10;

public class PinpangCoach extends Coach implements SpeakEnglish {

    public PinpangCoach() {
    }

    public PinpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void talkWithEng() {
        System.out.println("i'm coach of pinpang team,i can speak english");

    }

    @Override
    public void teach() {
        System.out.println("i can teach pinpang");

    }

}
