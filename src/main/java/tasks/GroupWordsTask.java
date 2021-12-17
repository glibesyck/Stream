package tasks;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Integer transform(Map.Entry<Character, List<String>> el) {
        int count = 0;
        for (String word: el.getValue()) {
            count += word.chars().filter(c -> c == el.getKey()).count();
        }
        return Integer.valueOf(count);
    }
    public Map<Character, Integer> groupIt(List<String> array) {
        return array.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> GroupWordsTask.transform(entry)));
    }
}
