package Adv_OOP.Demo07;

public class Employer {
    private String id;
    private String name;

    public Employer() {
    }

    public Employer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showIdCard() {
        System.out.println(this.id + " " + this.name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
