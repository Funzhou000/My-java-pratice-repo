package D4.homework;

public class yearjudge {
    public static void main(String[] args) {
        int star = 2019;
        int end = 1949;
        int year = star - end;
        int year1 = year % 12;// end+year1=first pig year
        end += year1;
        while (end <= 2019) {
            System.out.println(end);
            end += 12;
        }
    }
}
