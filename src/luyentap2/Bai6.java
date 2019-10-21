/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i < n; i++) {
            long x = in.nextLong();
            arr.add(x);
        }
        Collections.sort(arr);
        for(int i= 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");
        
    }
    
}
