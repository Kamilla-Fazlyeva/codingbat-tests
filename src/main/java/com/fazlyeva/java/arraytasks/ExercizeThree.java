package com.fazlyeva.java.arraytasks;

public class ExercizeThree {

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

}
