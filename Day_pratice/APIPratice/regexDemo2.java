package APIPratice;

public class regexDemo2 {
    public static void main(String[] args) {
        // judge a123a b123b c123c &abc&
        String regex1 = "(.).+\\1";
        System.out.println("&abc&".matches(regex1));
        // judge abc123avbc b456b 123789123 &!@abc&!@
        String regex2 = "(.)+.+\\1";
        System.out.println("&!@abc&!@".matches(regex2));
        // judge aaa123aaa bbb456bbb 55534555
        String regex3 = "((.)\\2).+\\1";
        System.out.println("abc123avbc".matches(regex3));
        // replace 哈基咪咪咪咪木南北绿豆to 哈基咪木南北绿豆
        String s = "哈基咪咪咪咪木南北绿豆";
        String result = s.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

    }
}
