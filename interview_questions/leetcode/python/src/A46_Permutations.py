#!/usr/bin/env python2.7
#
#def permute(self, nums):
def permute(nums):
        def backtrack(first = 0):
            print "line6:backtrack", "first:", first, "n:", n
            # if all integers are used up
            if first == n:
                output.append(nums[:])
                print("line10:backtrack:finished %s\n\n" % (output))
            for i in range(first, n):
                print "line12:backtrack", "first:", first, "n:", n
                # place i-th integer first
                print("line14:backtrack:swap:nums[first=%s], nums[i=%s] = nums[i=%s], nums[first=%s], nums=%s" % (first, i, i, first, nums))
                nums[first], nums[i] = nums[i], nums[first]
                print("line16:backtrack:nums[first]=%s, nums[i]=%s" % (nums[first],nums[i]))
                # use next integers to complete the permutations
                print("line18:backtrack:backtrack(first=%s + 1)" % (first))
                backtrack(first + 1)
                # backtrack
                nums[first], nums[i] = nums[i], nums[first]
                print("line22:backtrack:swap:nums[first=%s], nums[i=%s] = nums[i=%s], nums[first=%s], nums=%s" % (first, i, i, first, nums))

        n = len(nums)
        print "backtrack", n
        output = []
        backtrack()
        return output

input_data = ['a', 'b', 'c']
output_data = permute(input_data)
print output_data
