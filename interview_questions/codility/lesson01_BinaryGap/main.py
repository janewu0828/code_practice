#!/usr/local/bin/python
#
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(N):
    # write your code in Python 3.6
    result = 0
    len_list = []
    index_list = []
    binN = "{0:b}".format(N)
    print(binN)
    for index,char in enumerate(binN):
        if "1" == char:
            index_list.append(index)
            print(index, char)
    print(index_list)
    for index,num in enumerate(index_list):
        if index == 0:
            continue
        i_len = (num - index_list[index - 1]) - 1
        len_list.append(i_len)
    print(len_list)
    if len_list:
        result = max(len_list)
    return result
    pass
r = solution(529)
print(r)
