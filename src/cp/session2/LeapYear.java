/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.session2;

import java.util.Scanner;


/**
 *
 * @author dixit
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime(num);
    }

    public static void prime(int num) {
        if(num == 1 || num == 0){
            System.out.println("Not a prime");
            return;
        }
        for(int i=2; i < num; i++){
            if(num % i == 0){
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Its the prime number");
    }

}
