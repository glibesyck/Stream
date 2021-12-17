package tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTaskTest {
    FizzBuzzTask fizzBuzzTask = new FizzBuzzTask();

    @Test
    void fizzBuzzIt() {
        List<String> actualResult = fizzBuzzTask.fizzBuzzIt(16);
        List<String> expectedResult = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz Buzz");
        assertEquals(expectedResult, actualResult);
    }
}