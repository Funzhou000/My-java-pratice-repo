package D11;

public class Phone {
    String brand;
    int prince;

    public Phone() {
    }

    public Phone(String brand, int prince) {
        this.brand = brand;
        this.prince = prince;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrince() {
        return prince;
    }

    public void setPrince(int prince) {
        this.prince = prince;
    }

}
