/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nntam
 */
public class Bai18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        String a;
        int b;
        while(in.hasNext()) {
            a = in.next();
            switch(a) {
                case "push":
                    b = in.nextInt();
                    st.push(b);
                    break;
                case "pop": 
                    st.pop();
                    break;
                case "show": 
//                    System.out.println(st);
                    if(st.empty()) System.out.println("empty"); 
                    
                    else {
                        String x = "";
                        Iterator<Integer> it = st.iterator();

                        while(it.hasNext()) {
//                            System.out.print(it.next() + " ");
                            x +="" + it.next() + " ";
                        }
                        
                        System.out.println(x.trim());
                    }
                    break;
            }
        }
        
        
    }
}
