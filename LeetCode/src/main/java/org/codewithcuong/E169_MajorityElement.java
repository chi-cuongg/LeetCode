package org.codewithcuong;

public class E169_MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
