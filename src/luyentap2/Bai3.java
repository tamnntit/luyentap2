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
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    static int n, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        sort();
        
    }
    
    static void sort() {
        System.out.print("Buoc " + 0 + ": ");
        System.out.println(a[0]);
        for(int i = 1; i < n; i++) {
            int j = i-1, tem = a[i];
            while(j >= 0 && a[j] > tem) {
                a[j+1] = a[j]; j--;
            }
            a[j+1] = tem;
            
            System.out.print("Buoc " + i + ": ");
            for(int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        
        }
    }
    
}
