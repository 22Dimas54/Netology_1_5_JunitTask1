import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class JunitTaskTests {
    JunitTask sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new JunitTask();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test compiled");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests finished");
    }

    @Test
    public void testStringInArray() {
        //arrange
        String s = "3 Billion Devices Run Java";
        String[] expected = {"3", "Billion", "Devices", "Run", "Java"};
        //act
        String[] list = sut.stringInArray(s);
        //assert
        assertEquals(true, Arrays.equals(expected, list));
    }

    @Test
    public void testMaxElementOfArray() {
        //arrange
        List<Integer> list = Arrays.asList(2, 777, 555, 79, 36);
        int expected = 777;
        //act
        int result = sut.maxElementOfArray(list);
        //assert
        assertEquals(expected, result);
    }

    @Test
    void testGetValueOfHashMap() {
        //arrange
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bob");
        map.put(2, "Anna");
        map.put(3, "Ron");
        map.put(4, "Tom");
        map.put(5, "Din");
        String expected = "Ron";
        //act
        String result = sut.getValueOfHashMap(3, map);
        //assert
        assertEquals(expected, result);
    }
}
