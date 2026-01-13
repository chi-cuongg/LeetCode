package org.codewithcuong;

public class E507_PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int check = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i ==0){
                check += i;
            }
        }
        if(check == num) return true;
        return false;
    }
}
