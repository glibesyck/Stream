package tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GroupWordsTaskTest {
    GroupWordsTask groupWordsTask = new GroupWordsTask();

    @Test
    void groupIt() {
        List<String> array = Arrays.asList("abc", "fge", "aja");
        Map<Character, Integer> actualResult = groupWordsTask.groupIt(array);
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('a', 3);
        expectedResult.put('f', 1);
        assertEquals(expectedResult, actualResult);
    }
}