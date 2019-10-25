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
public class Bai17 {
    static long n, k, a[][], mod = (long)1e9+7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextLong(); k = in.nextLong();
            a = new long[11][11];
            for(int i = 0;i < n; i++) {
                for(int j = 0; j < n; j++) {
                    a[i][j] = in.nextLong();
                }
            }
            long x[][] = pow(k);
            for(int i = 0; i < n; i++)  {
                for(int j = 0; j < n; j++) {
                    System.out.print(x[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
    static long[][] nhanMT(long a[][], long b[][]) {
        long x[][] = new long[11][11];
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < n; j++){
               x[i][j] = 0;
               for(int k = 0; k < n; k++) {
                   x[i][j] = (x[i][j] + a[i][k]*b[k][j])%mod;
                }
            }
        }
        return x;
    }
    
    static long[][] pow(long k) {
        if(k == 1) return a;
        long x[][] = pow(k/2);
        if(k % 2 == 0) return nhanMT(x, x);
        else return  nhanMT(a, nhanMT(x, x));
    }
    
}
