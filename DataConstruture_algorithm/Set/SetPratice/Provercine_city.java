package DataConstruture_algorithm.Set.SetPratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringJoiner;

public class Provercine_city {
    public static void main(String[] args) {
        ArrayList<String> cities1 = new ArrayList<>();
        cities1.add("深圳");
        cities1.add("广州");
        cities1.add("东莞");
        ArrayList<String> cities2 = new ArrayList<>();
        cities2.add("北京");
        cities2.add("上海");
        cities2.add("重庆");
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("广东省", cities1);
        map.put("直辖市", cities2);
        for (String string : map.keySet()) {

            ArrayList<String> cList = map.get(string);
            StringJoiner sj = new StringJoiner(" , ");
            for (String city : cList) {
                sj.add(city);
            }
            System.out.println(string + "的城市有：" + sj.toString());
        }
    }
}
