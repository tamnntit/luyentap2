/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap2;

import java.util.Scanner;
import java.util.Stack;

/**
 * Da lam uu tien
 * @author nntam
 */
public class Bai19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0) {
            String s = in.nextLine();
            String result = "";
            Stack<Character> st = new Stack<Character>();
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z') {
                    result += String.valueOf(c);
                }
                else if(c == '(') {
                    st.push(c);
                } 
                
                else if(c == ')') {
                    char cc;
                    while(!st.empty() && (cc=st.pop()) != '('  ) {
                        result += String.valueOf(cc);
                    }
                }
                else if(c == '+' || c == '-' || c == '*' || c == '/') {
                    // lay het toan tu o dinh stack co uu tin cao hon
                    char cc;
                    while(!st.empty() && uuTien(cc = st.peek() ) >= uuTien(c)) {
                        result += String.valueOf(cc);
                        st.pop();
                    }
                    
                    st.push(c);
                }
                
            }
            while(!st.empty()) {
                result += st.pop();
            }
            System.out.println(result);
        }
    }
    
    static int uuTien(char c) {
        if(c == '(') return 0;
        else if(c == '*' || c == '/') return 2;
        else if(c == '+' || c == '-')return 1;
        return 3;
    }
}
