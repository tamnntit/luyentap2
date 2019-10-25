/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nntam
 */
public class Bai22 {
    static int n, a[], l[], r[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            a = new int[n+1];
            l = new int[n+1];
            r = new int[n+1];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int j = 0; j < n ; j++) {
                while(!st.empty() && a[st.peek()] >= a[j] ) st.pop();
                if(st.empty()) l[j] = -1;
                else l[j] = st.peek();
                    
                st.push(j);
            }
            while(!st.empty()) st.pop();
            
            for(int j = n-1; j >= 0 ; j--) {
                while(!st.empty() && a[st.peek()] >= a[j] ) st.pop();
                if(st.empty()) r[j] = n;
                else r[j] = st.peek();
                    
                st.push(j);
            }
            
            long max1 = 0;
            for(int i = 0; i < n; i++) {
                long s = (long)(r[i] - l[i]-1)*a[i];
                if(s > max1) max1 = s;
            }
            System.out.println(max1);
            
            
            
        }
        
    }
}
