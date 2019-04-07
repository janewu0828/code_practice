#!/usr/local/bin/python
#
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, K):
    # write your code in Python 3.6
    #copy list to result from A
    result = list(A)
    A_len = len(A)

    if K == A_len:
        return A

    for index,num in enumerate(A):
        result[(index + K) % A_len] = num
    print(A, result)
    return result
    pass
A = [3, 8, 9, 7, 6]
K = 3
r = solution(A, K)
print(r)
A = [1, 2, 3, 4]
K = 4
r = solution(A, K)
print(r)
