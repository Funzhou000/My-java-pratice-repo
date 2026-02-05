package DataConstruture_algorithm.Algorithm_CourseWork;

public class LambdaExpression {
    public static void main(String[] args) {
        methodA(() -> System.out.println("swimming"));
    }

    public static void methodA(swim s) {
        s.swimming();
    }

    public interface swim {
        public void swimming();

    }
}
