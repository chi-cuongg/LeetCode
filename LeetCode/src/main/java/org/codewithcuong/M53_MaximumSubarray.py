from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cur = best = nums[0]
        for x in nums[1:]:
            cur = max(x, x + cur)
            best = max(best, cur)
        return best
