package tasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public List<String> fizzBuzzIt(int number) {
        return IntStream.range(1, number)
                .mapToObj(FizzBuzzTask::transform)
                .collect(Collectors.toList());
    }

    public static String transform(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "Fizz Buzz";
            } else {
                return "Fizz";
            }
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
