package org.codewithcuong;

public class E35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] == target) return 0;
        if(nums.length == 1){
            if(nums[0] == target || nums[0] > target) return 0;
            else if(nums[0] < target) return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if(nums[i -1] > target) return (i-1);
            if (nums[i-1] < target && nums[i] > target) {
                return (i);
            }
        }
        return nums.length;
    }
}
