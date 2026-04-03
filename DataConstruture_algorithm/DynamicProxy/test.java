package DataConstruture_algorithm.DynamicProxy;

public class test {
    public static void main(String[] args) {

        BigStar bigStar = new BigStar("坤坤");
        Star star = ProxyUtil.createStar(bigStar);
        star.sing("kunkun");
    }
}
