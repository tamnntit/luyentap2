/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai8 {
    static int n;
    static long a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            Arrays.sort(a);
            long min1 = a[a.length - 1] - a[0], c = 0;
            long d;
            for(int i = 0; i < n-1; i++) {
                d = a[i+1] - a[i];
                if(d < min1) {
                    min1 = d;
                }
            }
            
            for(int i = 0; i < n-1; i++) {
                d = a[i+1] - a[i];
                if(d == min1) {
                    c++;
                }
            }
            
            System.out.println(min1+ " " + c);
            
        }
    }
}
