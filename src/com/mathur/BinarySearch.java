
/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.*/

package com.mathur;

import javax.swing.*;

public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {-1,0,3,5,9,12};
        int target = 1;
        int location = search(arr, target);
        System.out.println(location);
    }

    public static int search(int[] num, int target){
        int start=0;
        int end=num.length-1;
        int middleElement=0;

        while(start<=end){
           middleElement = start+ (end-start)/2;
           if (target==num[middleElement])
               return middleElement;
           else if(num[middleElement]>target) {
               end = middleElement - 1;
           }
           else {
               start = middleElement+1;
           }
        }
        return -1;
    }
}
