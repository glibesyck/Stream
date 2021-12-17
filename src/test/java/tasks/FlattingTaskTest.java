package tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlattingTaskTest {
    FlattingTask flattingTask = new FlattingTask();

    @Test
    void flattingStrings() {
        List<String> array = Arrays.asList("abc", "fge", "hjk");
        List<String> expectedResult = Arrays.asList("a", "b", "c", "f", "g", "e", "h", "j", "k");
        List<String> actualResult = flattingTask.flattingStrings(array);
        assertEquals(expectedResult, actualResult);

    }
}