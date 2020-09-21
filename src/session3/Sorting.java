/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.Arrays;

/**
 *
 * @author dixit
 */
public class Sorting {

    public static void main(String[] args) {
        int[] nums = {1, 6, 4, 2, 9, 7, 5};
        System.out.println(bubbleSort(nums));
        System.out.println(selectionSort(nums));
        System.out.println(insertionSort(nums));
    }

    public static String bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(nums);
    }

    public static String selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;

//            find the min
            for (int j = i + 1; j < nums.length - i; j++) { // j = i+1 : neglect min (first) element
                if (nums[j] < nums[min]) {
                    min = j;
                }

//            Swap the minimum element   
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;

            }
        }

        return Arrays.toString(nums);

    }
    
    
    public static String insertionSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(nums[i] < nums[j]){
                    swap(nums, i, j);
                }
            }
        }
    
        return Arrays.toString(nums);
        
    }

    public static void swap(int[] nums, int i, int j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
    }
    
}
