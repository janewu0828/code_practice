#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
# Given a word, you need to judge whether the usage of capitals in it is right or not.

# We define the usage of capitals in a word to be right when one of the following cases holds:
# 1. All letters in this word are capitals, like "USA".
# 2. All letters in this word are not capitals, like "leetcode".
# 3. Only the first letter in this word is capital, like "Google".

# Otherwise, we define that this word doesn't use capitals in a right way.

# Example 1:
# Input: "USA"
# Output: True

# Example 2:
# Input: "FlaG"
# Output: False

# Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
#
import unittest
from detect_capital import Solution

class SolutionTest(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def tearDown(self):
        self.solution = None

    def test_USA_should_return_true(self):
        self.assertTrue(self.solution.detectCapitalUse("USA"))

    def test_FlaG_should_return_true(self):
        self.assertFalse(self.solution.detectCapitalUse("FlaG"))

    def test_empty_should_return_true(self):
        self.assertFalse(self.solution.detectCapitalUse(""))

if __name__ == '__main__':
    unittest.main(verbosity=2)