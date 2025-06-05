package org.codewithcuong;

public class E27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int nums2[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums2[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums2[i];
        }
        return k;
    }
}
