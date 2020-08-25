#!/usr/bin/python
#
# Medium

# Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
# (https:en.wikipedia.org/wiki/In-place_algorithm)

# Example 1:
# Input:
# [
#   [1,1,1],
#   [1,0,1],
#   [1,1,1]
# ]
# Output:
# [
#   [1,0,1],
#   [0,0,0],
#   [1,0,1]
# ]
# Example 2:
# Input:
# [
#   [0,1,2,0],
#   [3,4,5,2],
#   [1,3,1,5]
# ]
# Output:
# [
#   [0,0,0,0],
#   [0,4,5,0],
#   [0,3,1,0]
# ]

# Follow up:
# - A straight forward solution using O(mn) space is probably a bad idea.
# - A simple improvement uses O(m + n) space, but still not the best solution.
# - Could you devise a constant space solution?

class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        #
        # Ref: http://bangbingsyb.blogspot.com/2014/11/leetcode-set-matrix-zeroes.html
        if len(matrix) <= 0:
            return

        hasZeroRow = [False] * len(matrix)
        hasZeroCol = [False] * len(matrix[0])

        for idx, row in enumerate(matrix):
            for idy, col in enumerate(row):
                if (matrix[idx][idy] == 0):
                    hasZeroRow[idx] = True
                    hasZeroCol[idy] = True
                    # print('matrix[{}][{}]={}, hasZeroRow={}, hasZeroCol={}'.format(idx, idy, matrix[idx][idy], hasZeroRow, hasZeroCol))

        for idx, isZeroRow in enumerate(hasZeroRow):
            for idy, isZeroCol in enumerate(hasZeroCol):
                if (isZeroRow or isZeroCol):
                    # print('isZeroRow||isZeroCol=True, matrix[{}][{}]={}, matrix={}, hasZeroCol={}'.format(idx, idy, matrix[idx][idy], matrix, hasZeroCol))
                    matrix[idx][idy] = 0
                    # print('isZeroRow||isZeroCol=True, matrix[{}][{}] becomes to {}, matrix={}, hasZeroCol={}'.format(idx, idy, matrix[idx][idy], matrix, hasZeroCol))

if __name__ == '__main__':
    solution = Solution()

    data = [[1,1,1],[1,0,1],[1,1,1]]
    solution.setZeroes(data)
    print('expected=[[1,0,1],[0,0,0],[1,0,1]], actual={}'.format(data))

    data = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    solution.setZeroes(data)
    print('expected=[[0,0,0,0],[0,4,5,0],[0,3,1,0]], actual={}'.format(data))

    data = []
    solution.setZeroes(data)
    print('expected=[], actual={}'.format(data))