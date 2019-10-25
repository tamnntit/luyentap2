/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai24 {
    static int max = 10001;
    static boolean c[] = new boolean[10001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
//            String a = in.next();
//            String b = in.next();
            Queue<Integer> q = new LinkedList<>();
            q.add(a);
            int dem = 0;
            sang();
            int z[] = new int[max];
            for(int i = 0; i < max; i++) z[i] = -1;
            z[a] = 0;
            while(!q.isEmpty()) {
                int x1 = q.poll();
                String x = String.valueOf(x1);
                for(int i = 0; i < 4; i++) {
                    
                    for(int j = 0; j < 10;j++) {
                       String temp = x;
                        StringBuilder temp1 = new StringBuilder(temp);
                        temp1.setCharAt(i,(char)(j + '0'));
                        temp = temp1.toString();
                        int num = Integer.valueOf(temp);
                        if(c[num] && num >= 1000 && z[num] == -1) {
                            q.add(num);
                            z[num] = z[x1]+1;
                            dem++;
                            if(num == b) {
                                break;
                            }
                        }
                        
                    }
                }
            }
            System.out.println(z[b]);
        }
    }
    
    static void sang() {
        for(int i = 2; i < max; i++) c[i] = true;
        for(int i = 2; i < max; i++) {
            if(c[i]) {
                for(int j = i*2; j< max; j+=i) {
                    c[j] = false;
                }
            }
        }
    }
    
}
