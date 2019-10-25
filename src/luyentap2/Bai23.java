/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t --> 0) {
            int n = in.nextInt();
            Queue<Integer> q = new LinkedList<>();
            int r = 0;
            while(n-- > 0) {
                int x = in.nextInt();
                
                switch(x) {
                    case 1:
                        System.out.println(q.size());
                        break;
                    case 2:
                        System.out.println(q.isEmpty()?"YES" : "NO");
                        break;
                    case 3:
                        r = in.nextInt();
                        q.add(r);
                        break;
                    case 4:
                        q.poll();
                        break;
                    case 5:
                        System.out.println(q.peek()==null?"-1":q.peek());
                        break;
                    case 6:
                        System.out.println(q.isEmpty()?"-1":r);
                        break;
                }
            }
        }
        
    }
}
