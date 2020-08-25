package leetcode_practice;

import java.util.Arrays;
import java.util.Collections;

public class A73_SetMatrixZeroes {
    // Medium
    //
    // Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
    // (https://en.wikipedia.org/wiki/In-place_algorithm)
    //
    // Example 1:
    // Input:
    // [
    //   [1,1,1],
    //   [1,0,1],
    //   [1,1,1]
    // ]
    // Output:
    // [
    //   [1,0,1],
    //   [0,0,0],
    //   [1,0,1]
    // ]
    // Example 2:
    // Input:
    // [
    //   [0,1,2,0],
    //   [3,4,5,2],
    //   [1,3,1,5]
    // ]
    // Output:
    // [
    //   [0,0,0,0],
    //   [0,4,5,0],
    //   [0,3,1,0]
    // ]
    //
    // Follow up:
    // - A straight forward solution using O(mn) space is probably a bad idea.
    // - A simple improvement uses O(m + n) space, but still not the best solution.
    // - Could you devise a constant space solution?

    public void setZeroes(int[][] matrix) {
        // Ref: http://bangbingsyb.blogspot.com/2014/11/leetcode-set-matrix-zeroes.html
        if (matrix == null || matrix.length == 0) {
            return;
        }

        final boolean[] hasZeroRow = new boolean[matrix.length];
        final boolean[] hasZeroCol = new boolean[matrix[0].length];
//        for (int i = 0; i < hasZeroRow.length; i++) {
//            System.out.println(hasZeroRow[i]);
//        }

        for (int x = 0; x < matrix.length; ++x) {
            for (int y = 0; y < matrix[0].length; ++y) {
                if (matrix[x][y] == 0) {
                    hasZeroRow[x] = true;
                    hasZeroCol[y] = true;
                }
            }
        }

        for (int x = 0; x < hasZeroRow.length; ++x) {
            for (int y = 0; y < hasZeroCol.length; ++y) {
                if (hasZeroRow[x] || hasZeroCol[y]) {
                    matrix[x][y] = 0;
                }
            }
        }
    }
}
