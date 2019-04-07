#!/usr/local/bin/python
#
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    result = 0
    sortA = sorted(A)
    #print(len(sortA), sortA[-1])
    if (len(sortA) != sortA[-1]):
        for index, value in enumerate(sortA):
            print((index + 1), value)
            if (index + 1) != value:
                result = (index + 1)
                break
    return result
A = [2, 3, 1, 5]
r = solution(A)
print(r)
