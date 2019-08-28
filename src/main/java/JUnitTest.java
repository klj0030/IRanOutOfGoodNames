import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class JUnitTest {
    @Test
    public void test_maxInt()
    {
        int[] intArray = new int[]{1, 13, 91, 132, 9, 25};
        int[] emptyArray = new int[0];
        int[] nullArray = null;
        Integer expectedResult = 132;
        Integer actualResult = Finder.findMax(intArray);
        assertEquals(expectedResult, actualResult);
        expectedResult = null;
        actualResult = Finder.findMax(emptyArray);
        assertEquals(expectedResult, actualResult);
        actualResult = null;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_minInt()
    {
        int[] intArray = new int[]{1, 13, 91, 132, 9, 25};
        int[] emptyArray = new int[0];
        int[] nullArray = null;
        Integer expectedResult = 1;
        Integer actualResult = Finder.findMin(intArray);
        assertEquals(expectedResult, actualResult);
        expectedResult = null;
        actualResult = Finder.findMax(emptyArray);
        assertEquals(expectedResult, actualResult);
        actualResult = null;
        assertEquals(expectedResult, actualResult);
    }
}