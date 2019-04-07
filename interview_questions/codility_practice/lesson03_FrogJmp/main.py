#!/usr/local/bin/python
#
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

from __future__ import division

def solution(X, Y, D):
    import math
    # write your code in Python 3.6
    result = 0
    times = (Y - X) / D
    print(times)
    result = math.ceil(times)
    return result
X = 10
Y = 85
D = 30
r = solution(X, Y, D)
print(r)
