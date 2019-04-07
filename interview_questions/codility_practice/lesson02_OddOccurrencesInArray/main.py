#!/usr/local/bin/python
#
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    result = 0
    uniq_dict = {}
    for num in A:
        if num not in uniq_dict:
            uniq_dict[num] = 1
            print(num, 1, uniq_dict)
            continue
        value = uniq_dict[num]
        uniq_dict[num] = value + 1
        print(num, uniq_dict[num], uniq_dict)
    for key in uniq_dict:
        if 1 == uniq_dict[key]:
            result = key
    return result
A = [ 9, 3, 9, 3, 9, 7, 9]
r = solution(A)
print(r)
