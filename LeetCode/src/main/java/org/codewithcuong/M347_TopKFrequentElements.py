class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        fre = Counter(nums).most_common(k)
        ans = []
        for f in fre:
            ans.append(f[0])
        return ans


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        return [num for num, count in Counter(nums).most_common(k)]
