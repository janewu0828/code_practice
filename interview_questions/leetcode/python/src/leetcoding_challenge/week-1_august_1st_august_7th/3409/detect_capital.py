#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if not word:
            return False

        return word.isupper() | word.islower() | (word == word.capitalize())