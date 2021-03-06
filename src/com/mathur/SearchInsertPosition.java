/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.*/package com.mathur;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        if (target<nums[0])
            return 0;
        if (target > nums[nums.length-1])
            return nums.length;
        while(end>=start){
            int mid = start + (end-start)/2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return end+1;
    }

    public static void main(String args[]){
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}
