#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
import re

class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        # if not word:
        #     return False

        # return word.isupper() | word.islower() | (word == word.capitalize())

        # leetcode
        # Ref: https://leetcode.com/problems/detect-capital/solution
        if not word:
            return False

        return re.fullmatch("[A-Z]+|[A-Z]?[a-z]+", word)