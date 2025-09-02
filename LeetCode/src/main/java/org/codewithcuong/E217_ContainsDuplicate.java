package org.codewithcuong;

import java.util.HashSet;

public class E217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int n : nums){
            if(hashset.contains(n)) return true;
            hashset.add(n);
        }
        return false;
    }
}
