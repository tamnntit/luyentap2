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
public class Bai21 {
    static int n, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            a = new int[n+1];
            for(int i = 1; i <= n; i++) {
                a[i] = in.nextInt();    
            }
            for(int i = 1; i <= n; i++) {
                boolean ok = false;
                for(int j = i+1; j <= n; j++) {
                    if(a[j] > a[i]) {
                        ok = true;
                        System.out.print(a[j] + " ");
                        break;
                    }
                }
                if(!ok) {
                    System.out.print("-1 ");
                }
                
             }
            System.out.println("");
        }
    }
}
