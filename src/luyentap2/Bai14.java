/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Scanner;

/**
 * Bai toan thanh tinh 2^(n-1)
 * @author nntam
 */
public class Bai14 {
    static long mod = 123456789;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n;
        while(t-- > 0) {
            n = in.nextLong();
            // tinh w^(n-1)
            System.out.println(pow(n-1));
        }
    }
    
    static long pow(long n) {
        if(n == 0) return 0;
        if(n == 1) return 2;
        long x = pow(n/2);
        if(n % 2 == 0) return (x*x)%mod;
        else  return (2 * (x*x)%mod)%mod;
    }
    
}
