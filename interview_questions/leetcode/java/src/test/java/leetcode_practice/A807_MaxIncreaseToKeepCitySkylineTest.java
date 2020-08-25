package leetcode_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A807_MaxIncreaseToKeepCitySkylineTest {

    @Test
    public void maxIncreaseKeepingSkyline() {
        // maxRow=[8, 7, 9, 3]
        // maxCol=[9, 4, 8, 7]
        final int[][] input = {
                { 3, 0, 8, 4 },
                { 2, 4, 5, 7 },
                { 9, 2, 6, 3 },
                { 0, 3, 1, 0 }
        };
        final A807_MaxIncreaseToKeepCitySkyline run = new A807_MaxIncreaseToKeepCitySkyline();

        final int actual = run.maxIncreaseKeepingSkyline(input);

        assertEquals(35, actual);
    }

    @Test
    public void maxIncreaseKeepingSkyline2() {
        // maxRow=[88, 38, 51]
        // maxCol=[59, 88, 51]
        final int[][] input = {
                { 59, 88, 44 },
                { 3, 18, 38 },
                { 21, 26, 51 }
        };
        final A807_MaxIncreaseToKeepCitySkyline run = new A807_MaxIncreaseToKeepCitySkyline();

        final int actual = run.maxIncreaseKeepingSkyline(input);

        assertEquals(117, actual);
    }
}
