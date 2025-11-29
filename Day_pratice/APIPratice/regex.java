package APIPratice;

public class regex {
    public static void main(String[] args) {
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13724300268".matches(regex1));
        String regex2 = "0[2-9]{2,3}-?[\\d&&[^0]]\\d{4,6}";
        System.out.println("029-123456".matches(regex2));// t
        System.out.println("019-123456".matches(regex2));// f
        System.out.println("0293-123456".matches(regex2));// t
        // lifunzhou@gmail.com
        String regex3 = "\\w+@\\w+/.\\w+{1,}";
        System.out.println("lifunzhou@gmail.com".matches(regex3));// t
        // 4 69002 2005 11 09 711 9
        // [1-9] \\d{5} [1-2][9|0][\\d]{2} (0[1-9])|(1[0-2]) [0-3][0-9] \\d{3}
        // [\\dXx]|[\\d(?i)x]
        String regex4 = "[1-9]\\d{5}[1-2][90]\\d{2}((0[1-9])|(1[0-2]))[0-3][0-9]\\d{3}[\\dXx]";
        System.out.println("469002200511097119".matches(regex4));// t
    }

}
