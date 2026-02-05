package Adv_OOP.Demo10;

public class PinpangAthlete extends Athlete implements SpeakEnglish {

    public PinpangAthlete() {
    }

    public PinpangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("Athelets keen on playing pinpang");

    }

    @Override
    public void talkWithEng() {
        System.out.println("i'm pinpang Athelete i can speak english");

    }

}
