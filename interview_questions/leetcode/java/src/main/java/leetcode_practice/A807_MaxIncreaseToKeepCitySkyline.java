package leetcode_practice;

import java.util.Arrays;

public class A807_MaxIncreaseToKeepCitySkyline {
    // In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there
    //. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be
    //different for different buildings). Height 0 is considered to be a building as well.
    //
    //At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and
    //right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of
    //the rectangles formed by all the buildings when viewed from a distance. See the following example.
    //
    //What is the maximum total sum that the height of the buildings can be increased?
    //
    //Example:
    //Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
    //Output: 35
    //Explanation: The grid is:
    //[ [3, 0, 8, 4],
    //  [2, 4, 5, 7],
    //  [9, 2, 6, 3],
    //  [0, 3, 1, 0] ]
    //
    //The skyline viewed from top or bottom is: [9, 4, 8, 7]
    //The skyline viewed from left or right is: [8, 7, 9, 3]
    //
    //The grid after increasing the height of buildings without affecting skylines is:
    //gridNew = [ [8, 4, 8, 7],
    //            [7, 4, 7, 7],
    //            [9, 4, 8, 7],
    //            [3, 3, 3, 3] ]
    //
    //Notes:
    //1. 1 < grid.length = grid[0].length <= 50.
    //2. All heights grid[i][j] are in the range [0, 100].
    //3. All buildings in grid[i][j] occupy the entire grid cell: that is, they are a 1 x 1 x grid[i][j]
    //rectangular prism.

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        final int MIN_NUMBER = 0, MAX_NUMBER = 100;
        final int[] maxCol = Arrays.copyOf(grid[0], grid[0].length);
        final int[] maxRow = new int[grid.length];

        for (int x = 0; x < grid.length; x++) {
            maxRow[x] = Arrays.stream(grid[x]).max().getAsInt();
            for (int y = 0; y < grid[x].length; y++) {
                if (x == 0) {
                    continue;
                }
                if (grid[x][y] < MIN_NUMBER) {
                    maxCol[y] = Math.max(MIN_NUMBER, maxCol[y]);
                    continue;
                }
                if (grid[x][y] > MAX_NUMBER) {
                    maxCol[y] = Math.max(maxCol[y], MAX_NUMBER);
                    continue;
                }

                maxCol[y] = Math.max(grid[x][y], maxCol[y]);
//                System.out.println("x=" + x + ", y=" + y + ", grid[x][y]=" + grid[x][y] + ", maxCol[y]=" + maxCol[y]);
            }
        }

//        for (int i = 0; i < grid.length; i++) {
//            System.out.println("i=" + i + ", maxCol[i]=" + maxCol[i]);
//        }
//        for (int i = 0; i < grid.length; i++) {
//            System.out.println("i=" + i + ", maxRow[i]=" + maxRow[i]);
//        }

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                final int increased = Math.min(maxCol[y], maxRow[x]) - grid[x][y];
                if (increased > 0) {
                    result += increased;
                }
//                System.out.println("x=" + x + ", y=" + y + ", grid[x][y]=" + grid[x][y] + ", maxCol[y]=" + maxCol[y] + ", maxRow[x]=" + maxRow[x] + ", result=" + result);
            }
        }

        return result;
    }
}
