package org.codewithcuong;

public class E58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int j = s.length() - 1;
        while(s.charAt(j) == ' '){
            j--;
        }
        while(j >= 0 && s.charAt(j) != ' '){
            len++;
            j--;
        }
        return len;
    }
}
