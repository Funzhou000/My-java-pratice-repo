package D8;

public class StanderClass {
    // 类名见名知意
    // 成员变量使用private
    private String name;
    private int age;
    // 右键，Generate Getters and Setters... (生成 Getters 和 Setters...)

    // Generate Constructor using Fields... (使用字段生成构造函数...)

    // Generate hashCode() and equals()...

    // Generate toString()...
    public StanderClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 至少两个构造方法
    // 无参构造方法
    // 带全部参数构造方法

    // public StanderClass(){

    // }
    // public StanderClass(String nmae,int age){

    // }
    // //提供每一个成员变量对应的set,get
    // public void setName( String name){
    // this.name= name;
    // }
    // public void setAge(int age){
    // this.age=age;
    // }

}
