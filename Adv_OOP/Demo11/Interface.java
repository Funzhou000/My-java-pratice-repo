package Adv_OOP.Demo11;

public interface Interface {
    public default void show1() {
        System.out.println("1");
        show3();
    }
    public default void show20() {
        System.out.println("1");
        show3();
    }
    public default void show10() {
        System.out.println("1");
        show3();
    }
    public default void show4() {
        System.out.println("1");
        show3();
    }
    public default void show5() {
        System.out.println("1");
        show3();
    }
    public default void show6() {
        System.out.println("1");
        show3();
    }

    public static void show7() {
        System.out.println("1");
        show2();
    }

    private void show3() {
        System.out.println("static method ");
    }

    private static void show2() {
        System.out.println("3");
    }
}
