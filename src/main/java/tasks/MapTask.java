package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public List<Integer> mapping(List<String> array) {
        return array.stream()
                .filter(x -> x.matches("[0-9]+"))
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());
    }
}
