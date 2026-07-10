class Solution:

    def encode(self, strs: List[str]) -> str:
        en = ""
        for s in strs:
            en += str(len(s)) + "#" + s
        return en

    def decode(self, s: str) -> List[str]:
        res = []
        i = 0
        while i < len(s):
            j = s.find("#", i)
            length = int(s[i:j])
            word = s[j + 1: j + length + 1]
            res.append(word)
            i = j + length + 1
        return res
