package org.codewithcuong;

public class M12_IntegerToRoman {
    public String intToRoman(int num) {
        int[] arr1 = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] arr2 = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int index = 0; index<arr1.length && num>0; index++)
        {
            while(num>=arr1[index])
            {
                sb.append(arr2[index]);
                num-=arr1[index];
            }
        }

        return sb.toString();
    }
}
