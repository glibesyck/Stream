package tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapTaskTest {
    MapTask mapTask = new MapTask();

    @Test
    void mapping() {
        List<String> array = Arrays.asList("1", "abc", "3");
        List<Integer> expectedResult = Arrays.asList(1, 3);
        List<Integer> actualResult = mapTask.mapping(array);
        assertEquals(actualResult, expectedResult);
    }
}