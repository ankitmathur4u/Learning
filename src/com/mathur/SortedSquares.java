/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.*/
package com.mathur;

public class SortedSquares {
    public static void main(String args[]){
        sortedSquares(new int[]{-4, -1, 0, 3, 10, 12});
    }

    public static int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 0;
        int right =answer.length-1;
        for (int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                answer[i] = nums[left]*nums[left];
                left++;
            } else {
                answer[i] = nums[right]*nums[right];
                right--;
            }
        }
        return answer;
    }
}
