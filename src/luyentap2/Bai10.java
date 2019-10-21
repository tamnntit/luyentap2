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
public class Bai10 {
    static int n, x[], q, y[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        x = new int[n];
        for(int i = 0; i < n; i++) x[i] = in.nextInt();
        q = in.nextInt();
        Arrays.sort(x);
        while(q-- > 0) {
            int k = in.nextInt();
            bsearch(k);
        }
        
    }
    static void bsearch(int k) {
        int l = 0, r = n-1;
        int m = (l+r)/2;
        while(l != m && r != m) {
            if(x[m] > k) r = m;
            else l = m;
            m =(l+r)/2;
        }
        boolean ok = false;
        for(int i = l; i <= r; i++) {
            if(x[i] > k) {
                ok = true;
                System.out.println(i);
                break;
            }
        }
        if(!ok) {
            System.out.println(n);
        }
        
    }
}
