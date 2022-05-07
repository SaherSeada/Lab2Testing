import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2Test {
    Lab2 testclass = new Lab2();

    @Test
    public void evenOrOdd() {
        assertEquals("Even", testclass.evenOrOdd(4));
        assertEquals("Even", testclass.evenOrOdd(2));
        assertEquals("Even", testclass.evenOrOdd(0));
        assertEquals("Odd", testclass.evenOrOdd(1));
        assertEquals("Odd", testclass.evenOrOdd(3));
        assertEquals("Even", testclass.evenOrOdd(98));
        assertEquals("Odd", testclass.evenOrOdd(99));
        assertEquals("Even", testclass.evenOrOdd(100));
        assertEquals("Odd", testclass.evenOrOdd(101));
        assertEquals("Even", testclass.evenOrOdd(1000));
        assertEquals("Odd", testclass.evenOrOdd(1001));
    }

    @Test
    public void maxmin() {
        assertEquals("7 and -5", testclass.maxmin(new int[] {3, -1, 7, -5, 2, -4, 2, -1, -3}));
        assertEquals("20 and -50", testclass.maxmin(new int[] {4, 1, 20, -2, 4, -1, 1, -50, -3}));
        assertEquals("0 and 0", testclass.maxmin(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}));
        assertEquals("1 and 1", testclass.maxmin(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }
}