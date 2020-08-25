package leetcode_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A73_SetMatrixZeroesTest {
    @Test
    void setZeroes() {
        final int[][] input = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        final int[][] expect = {
                { 1, 0, 1 },
                { 0, 0, 0 },
                { 1, 0, 1 }
        };

        final A73_SetMatrixZeroes test = new A73_SetMatrixZeroes();
        test.setZeroes(input);

        assertArrayEquals(expect, input);
    }

    @Test
    void setZeroes_example2() {
        final int[][] input = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };
        final int[][] expect = {
                { 0, 0, 0, 0 },
                { 0, 4, 5, 0 },
                { 0, 3, 1, 0 }
        };

        final A73_SetMatrixZeroes test = new A73_SetMatrixZeroes();
        test.setZeroes(input);

        assertArrayEquals(expect, input);
    }

    @Test
    void setZeroes_example3() {
        final int[][] input = new int[1][1];
        final int[][] expect = new int[1][1];

        final A73_SetMatrixZeroes test = new A73_SetMatrixZeroes();
        test.setZeroes(input);

        assertArrayEquals(expect, input);
    }
}