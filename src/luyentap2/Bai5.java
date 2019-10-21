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
public class Bai5 {
    static int n, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            for(int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
    }
}
