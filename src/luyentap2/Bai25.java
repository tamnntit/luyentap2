/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine(), b = in.nextLine();
        Queue<String> q = new LinkedList<String>();
        q.add(a);
        int dem = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(a, 0);
        
        while (!q.isEmpty()) {
            String x = q.poll();
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(2, x.charAt(0));
            sb.setCharAt(8, x.charAt(2));
            sb.setCharAt(6, x.charAt(8));
            sb.setCharAt(0, x.charAt(6));

            String xx = sb.toString();
            dem++;
            hm.put(xx, hm.get(x)+1);
            q.add(xx);
            if (xx.equals(b)) {
                break;
            }
            StringBuilder sb1 = new StringBuilder(x);
            sb1.setCharAt(4, x.charAt(2));
            sb1.setCharAt(10, x.charAt(4));
            sb1.setCharAt(8, x.charAt(10));
            sb1.setCharAt(2, x.charAt(8));

            String xxx = sb1.toString();
            q.add(xxx);
            hm.put(xxx, hm.get(x)+1);
            if (xx.equals(b)) {
                break;
            }
//            System.out.println(xx);
//            System.out.println(xxx);
        }
        System.out.println(hm.get(b));

    }
}

