package DataConstruture_algorithm.DynamicProxy;

public class BigStar implements Star {
    String name;
    @Override
    public String sing(String name){
        System.out.println(name+"正在唱歌...");
        return name+"唱歌结束了...";
    }
    @Override
    public void dance(){
        System.out.println("dancing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigStar() {
    }
    public BigStar(String name) {
        this.name = name;
    }
}
