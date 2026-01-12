package org.codewithcuong;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean checkPerfectNumber(int num) {
        int check = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i ==0){
                check += i;
            }
        }
        if(check == num) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(checkPerfectNumber(s.nextInt()));
    }


}