/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

import java.util.Arrays;

/**
 *
 * @author dixit
 */
public class Recurssion {

    public static void main(String[] args) {
        int input = 7;
//        printIncrementNumsWithRecc(input);
//        printDecrementNumsWithRecc(input);

//        int fiveFact = findFactorial(input);
//        System.out.println(fiveFact);
        int nums[] = {1, 5, 6, 3, 7 };
//        System.out.println(searchWithRecc(nums,input, 0));
        int start = 0, end = nums.length;
        Arrays.sort(nums);
        System.out.println("Finding "+ input + " in " +Arrays.toString(nums));
        int ind;
        ind = binSearch(nums, start, end, input);
        System.out.println(++ind);
    }

    public static void printIncrementNumsWithRecc(int n) {
        if (n == 0) {
            return;
        }
        printIncrementNumsWithRecc(--n);
        System.out.print(n + " ");
    }

    public static void printDecrementNumsWithRecc(int n) {
        if (n == 0) {
            return;
        }
        printDecrementNumsWithRecc(--n);
        System.out.print(n + " ");
    }

    public static int findFactorial(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * findFactorial(i - 1);
        }
    }

    public static boolean searchWithRecc(int[] nums, int key, int i) {

        if (i == nums.length) {
            return false;
        }
        if (nums[i] == key) {
            return true;
        }

        return searchWithRecc(nums, key, i + 1);

    }

    private static int binSearch(int[] nums, int start, int end, int key) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            } 
            
            if (key < nums[mid]) {
                return binSearch(nums, start, mid - 1, key);
            } else {
                return binSearch(nums, mid + 1, end, key);
            }
        }
        return -1;
    }
}
