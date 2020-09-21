/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session3;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author dixit
 */
public class ArrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums  = {2,6,4,1,9};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int high = nums.length -1;
        int low = 0;
        int key = 3;
        System.out.println("Searching for " + key + " element !");
        System.out.println(LinerSearch(nums, key) + " Position");
        System.out.println(binSearch(nums, low,  high,  key) + " position");
        System.out.println(maxElement(nums) + " is max");
    }
    public static int LinerSearch(int[] nums, int key) {
        for(int i=0; i < nums.length; i++){
            if(key == nums[i])
                return i;
           }
        return -1;
    }
    
    public static int binSearch(int[] nums,int low, int high, int key){
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == key){
                return mid;
            } else if(key > nums[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
       return -1; 
    }

    public static int maxElement(int[] nums){
        int max = nums[0];
        for(int i=1; i< nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
