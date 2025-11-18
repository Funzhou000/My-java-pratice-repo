package Adv_OOP.Demo11;

public abstract class InterAdapter implements Interface {
// 抽象类不能实例化。
// 抽象类不一定有抽象方法有抽象方法一定得是抽象类
// 可以有构造方法
// 抽象类的子类
// 要么重写所有抽象方法
// 要么是抽象类
    @Override
    public void show1() {
        // TODO Auto-generated method stub
        Interface.super.show1();
    }

    @Override
    public void show10() {
        // TODO Auto-generated method stub
        Interface.super.show10();
    }

    @Override
    public void show20() {
        // TODO Auto-generated method stub
        Interface.super.show20();
    }

    @Override
    public void show4() {
        // TODO Auto-generated method stub
        Interface.super.show4();
    }

    @Override
    public void show5() {
        // TODO Auto-generated method stub
        Interface.super.show5();
    }

    @Override
    public void show6() {
        // TODO Auto-generated method stub
        Interface.super.show6();
    }

}
