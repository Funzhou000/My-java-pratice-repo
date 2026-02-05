package Adv_OOP.Demo12;

public class Car {
    String name;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(name);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(carAge);
        }
    }
}
