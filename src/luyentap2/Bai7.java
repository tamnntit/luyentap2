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
public class Bai7 {
    static int n, a[], b[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            
            a = new int[n];
            b = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            int l = 0, r = n-1;
            
            while(l < n && a[l] == b[l]) l++;
            while(r>=0 && a[r] == b[r]) r--;
            int d = r-l+1;
            
            System.out.println(d <= 0?"YES":d);
        } 
            
    }
}
