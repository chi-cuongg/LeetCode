package org.codewithcuong;

public class E28_FindTheIndexOfTheFirstOccurrenceInaString {
    public int strStr(String haystack, String needle) {
        int Hlen = haystack.length();
        int Nlen = needle.length();
        if(Nlen == 0) return 0;
        if(Nlen > Hlen) return -1;
        for(int i = 0; i <= Hlen - Nlen; i++){
            if(haystack.substring(i, i + Nlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
