#!/usr/local/bin/python
# -*- coding: utf-8 -*-
#
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

#For example, consider array A such that:
#
#  A[0] = 3
#  A[1] = 1
#  A[2] = 2
#  A[3] = 4
#  A[4] = 3
#We can split this tape in four places:
#
#P = 1, difference = |A[0] - (A[1] + A[2] + A[3]) + A[4])| = |3 − 10| = 7 
#P = 2, difference = |4 − 9| = 5 
#P = 3, difference = |6 − 7| = 1 
#P = 4, difference = |10 − 3| = 7 
#returns the minimal difference

def solution(A):
    # write your code in Python 3.6
    result = 0
    difference_list = []
    P = 1
    while (P < len(A)):
        a_list = []
        b_list = []
        for index,value in enumerate(A):
            print(P, index, value, (P > index))
            if (P > index):
                a_list.append(value)
                print("%s, add A[%s] into a" % (P, index))
            else:
                b_list.append(value)
        a = sum(a_list)
        b = sum(b_list)
        print(P, a, a_list)
        print(P, b, b_list)
        difference = abs(a - b)
        print(P, difference)
        difference_list.append(difference)
        P = P + 1
    result = min(difference_list)
    return result
A = [3, 1, 2, 4, 3]
r = solution(A)
print(r)
