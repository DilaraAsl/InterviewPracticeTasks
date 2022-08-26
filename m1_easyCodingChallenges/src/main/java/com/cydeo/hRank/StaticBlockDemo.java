package com.cydeo.hRank;

import java.util.Scanner;

public class StaticBlockDemo {

    static boolean flag;
    static int B;
    static int H;
    static{
        Scanner kb=new Scanner(System.in);
        B=kb.nextInt();
        H=kb.nextInt();
        flag=B>0&&H>0;
        try{
            if(!flag) throw new Exception();
        }
        catch(Exception e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }


    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }


    }
}
