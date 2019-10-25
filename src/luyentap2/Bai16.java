/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai16 {
    static long n, a[][] = new long [3][3], mod = (long)1e9+7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextLong();
            a[0][0] = 0; a[0][1] = 1; a[1][0] = 1; a[1][1] = 1;
            if(n == 1) {
                System.out.println("1");
                continue;
            }
            long [][]x = pow(n-1);
            System.out.println(x[1][1]);
//            for(int i = 1;i <= 2; i++) {
//                for(int j = 1; j <= 2; j++) {
//                    System.out.print(x[i][j] +" ");
//                }
//                System.out.println("");
//            }
        }
    }
    
    static long[][] nhanMT(long a[][], long b[][]) {
        long x[][] = new long[3][3];
        for(int i = 0; i <=1 ; i++) {
            for(int j = 0; j <= 1; j++) {
                x[i][j] = 0;
                for(int k = 0; k <=1 ; k++) {
                    x[i][j] = (x[i][j] + a[i][k]*b[k][j])%mod;
                }
            }
        }
        return x;
    }
    
    static long[][] pow(long n) {
        if(n == 1) return a;
        
        long x[][] = new long[3][3];
        x = pow(n/2);
        if(n % 2 == 0) return nhanMT(x, x);
        else return nhanMT(a, nhanMT(x, x));
        
    }
}
