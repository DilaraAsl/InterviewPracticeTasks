package com.cydeo.hRank;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisStackTask {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> p=new Stack<>();

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            if(input.isEmpty()){System.out.println("true"); continue;}
            if(input.length()%2!=0) {System.out.println("false"); continue;}

            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i)=='('||input.charAt(i)=='{'||input.charAt(i)=='[')
                    p.push(input.charAt(i));
                else if(!p.isEmpty()&&(input.charAt(i)==')'&& p.peek()=='(')) p.pop();
                else if(!p.isEmpty()&&(input.charAt(i)==']'&& p.peek()=='[')) p.pop();
                else if(!p.isEmpty()&&(input.charAt(i)=='}'&& p.peek()=='{')) p.pop();
                else if(p.isEmpty()&& input.charAt(i)==')') {p.push(input.charAt(i)); break;}
                else if(p.isEmpty()&& input.charAt(i)=='}') {p.push(input.charAt(i)); break;}
                else if(p.isEmpty()&& input.charAt(i)==']') {p.push(input.charAt(i)); break;}

            }
            if(p.isEmpty()) System.out.println("true");
else System.out.println("false");

            p.removeAllElements();

        }
    }
}


