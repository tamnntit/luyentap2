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
 * dang loi
 * @author nntam
 */
public class Bai26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean check[][] = new boolean[101][101];
        for(int i = 0; i < n; i++) {
            String s = in.next();
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '.') check[i][j] = true;
                else check[i][j] = false;
            }
        }
        
        Pair a = new Pair();
        Pair b = new Pair();
        a.x = in.nextInt();
        a.y= in.nextInt();
        b.x = in.nextInt();
        b.y = in.nextInt();
        Queue<Pair> q = new LinkedList<>();
        q.add(a);
        HashMap<Pair, Integer> hm = new HashMap<>();
        hm.put(a, 0);
        while(!q.isEmpty()){
            Pair p = q.poll();
            for(int i = p.y+1; i < n; i++) {
                if(check[p.x][i] == false) break;
                Pair p1 = new Pair(p.x, i);
                q.add(p1);
                hm.put(p1, hm.get(a)+1);
            }
            for(int i = p.y-1; i >= 0; i--) {
                if(check[p.x][i] == false) break;
                Pair p1 = new Pair(p.x, i);
                q.add(p1);
                hm.put(p1, hm.get(a)+1);
            }
            for(int i = p.x+1; i < n; i++) {
                if(check[i][p.y] == false) break;
                Pair p1 = new Pair(i, p.y);
                q.add(p1);
                hm.put(p1, hm.get(a)+1);
            }
            for(int i = p.x-1; i >= 0; i--) {
                if(check[i][p.y] == false) break;
                Pair p1 = new Pair(i, p.y);
                q.add(p1);
                hm.put(p1, hm.get(a)+1);
            }
        }
        System.out.println(hm.get(b));
    }
}

class Pair {
    public int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair() {
    }
    
    
}
