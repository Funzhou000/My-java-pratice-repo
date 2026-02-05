package DataConstruture_algorithm.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> actorList = new ArrayList<>();
        ArrayList<String> actressList = new ArrayList<>();
        initial(actorList, actressList);
        Stream<String> acStream = actorList.stream().filter(s -> s.length() >= 3).limit(2);
        Stream<String> atStream = actressList.stream().skip(1).filter(s -> "杨".equals(s.split(",")[0].substring(0, 1)));
        // Stream<String> combinedStream = Stream.concat(acStream, atStream);
        Map<String, Integer> mp = Stream.concat(acStream, atStream)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        List<Actor> result = new ArrayList<>();
        for (String string : mp.keySet()) {
            result.add(new Actor(string, mp.get(string)));
        }
        System.out.println(result);
    }

    private static void initial(ArrayList<String> ActorList, ArrayList<String> ActressList) {
        ActorList.add("李四,19");
        ActorList.add("王五,24");
        ActorList.add("赵六,25");
        ActorList.add("zhanghan,18");
        ActorList.add("lisi,20");
        ActorList.add("wangwu,22");

        ActressList.add("小红,16");
        ActressList.add("小丽,21");
        ActressList.add("小翠,22");
        ActressList.add("小芳,20");
        ActressList.add("xiaohong,18");
        ActressList.add("杨道光,19");
    }
}
