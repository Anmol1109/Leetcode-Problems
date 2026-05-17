class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = {}
        for i in nums:
            if i not in ans:
                ans[i] = 1
            else:
                ans[i] = ans[i] + 1
        for i in ans:
            if ans[i] == 1:
                return i