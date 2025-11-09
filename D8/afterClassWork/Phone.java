package D8.afterClassWork;

public class Phone {
    private String brand;
    private double price;
    private String color;

    // 两个构造
    public Phone() {
    }

    // 含有全部成员变量的构造
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;

    }

    // set方法
    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }
}
