package onboarding;

import java.util.Collections;
import java.util.List;
import java.util.*;
public class Problem7 {

    static Map<String, ArrayList> friendMap = new TreeMap<>();
    static Map<String, Integer> mapPoints = new TreeMap<>();
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }

    public static void makeFriendsMap(List<String> friendsList) {

        ArrayList list1 = friendMap.getOrDefault(friendsList.get(0), new ArrayList());
        ArrayList list2 = friendMap.getOrDefault(friendsList.get(1), new ArrayList());

        list1.add(friendsList.get(1));
        list2.add(friendsList.get(0));

        friendMap.put(friendsList.get(0), list1);
        friendMap.put(friendsList.get(1), list2);
    }
}
