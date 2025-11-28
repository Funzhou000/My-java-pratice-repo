package APIPratice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigDecimal {
    public static void main(String[] args) {
        // 作用 ，解决较大的小数，和小数运算失真问题
        // 较大的小数用构造创建对象，一般的用 valueof
        BigDecimal bd = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        System.out.println(bd.add(bd2));
        System.out.println(bd.subtract(bd2));// 0
        System.out.println(bd.multiply(bd2));// 0.01
        System.out.println(bd.divide(bd2));// 默认方式在处理商为无限循环小数时表现不佳，建议使用，自己设置位数，舍入的方法
        System.out.println(bd.divide(bd2, 2, RoundingMode.HALF_UP));// 1.00

    }
}
