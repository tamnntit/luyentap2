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
public class Bai7 {
    static int n, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            a = new int[n+1];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int max1 = 0;
            for(int i = 0; i < n; i++) {
                int key = a[i];
                int j = n-1;
                while(j > i && a[j] >= key) {
                    j--;
                }
                if(j > i) {
//                    System.out.println(i + ": " + j);
                    int d = j-i+1;
                    if(d > max1) {
                        max1=  d;
                    }
                }
                
            }
            System.out.println(max1 ==0?"YES":max1);
        } 
            
    }
}
