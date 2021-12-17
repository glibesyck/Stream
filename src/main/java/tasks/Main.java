package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MapTask mapTask = new MapTask();
        FlattingTask flattingTask = new FlattingTask();
        FizzBuzzTask fizzBuzzTask = new FizzBuzzTask();
        GroupWordsTask groupWordsTask = new GroupWordsTask();
        List<String> array = Arrays.asList("1", "abc", "3");
        System.out.println(mapTask.mapping(array));
        List<String> newArray = Arrays.asList("abc", "fge", "hjk");
        System.out.println(flattingTask.flattingStrings(newArray));
        System.out.println(fizzBuzzTask.fizzBuzzIt(100));
        List<String> newNewArray = Arrays.asList("abc", "fge", "aja");
        System.out.println(groupWordsTask.groupIt(newNewArray));
    }
}
