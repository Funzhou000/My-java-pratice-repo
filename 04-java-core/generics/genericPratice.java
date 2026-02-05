package DataConstruture_algorithm.Algorithm_CourseWork;

public class genericPratice {
    public static void main(String[] args) {
        GenericPraticeClass<Integer> genericPraticeClass = new GenericPraticeClass<>();
        genericPraticeClass.add(1);
        genericPraticeClass.add(2);
        System.out.println(genericPraticeClass);
        System.out.println(genericPraticeClass.get(0));
    }
}
