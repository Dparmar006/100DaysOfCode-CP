/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

/**
 *
 * @author dixit
 */
public class Recurssion {

    public static void main(String[] args) {
        printIncrementNumsWithRecc(5);
        printDecrementNumsWithRecc(5);
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
}
