package com.cydeo.hRank;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String dateReturned=kb.nextLine();
        String dueDate=kb.nextLine();
        if( dateReturned.isEmpty()) System.out.println(0);
        if(dueDate.isEmpty()) System.out.println(0);
        String[] dateR=dateReturned.split("\\s+");
        String[] dueD=dueDate.split("\\s+");
// if year is greater than fine
// if year is less than no fine
// if year is the same check the month
        if(Integer.parseInt(dateR[2])>Integer.parseInt(dueD[2])) {System.out.println(1000); return ;}
        else if(Integer.parseInt(dateR[2])<Integer.parseInt(dueD[2])) {System.out.println(0); return;}
        else{
            // if month is greater than fine
            // if month is less than no fine
            // if equal continue
            if(Integer.parseInt(dateR[1])>Integer.parseInt(dueD[1]))
            {System.out.println((Integer.parseInt(dateR[1])-Integer.parseInt(dueD[1]))*500);
                return;}
            else if(Integer.parseInt(dateR[1])<Integer.parseInt(dueD[1])) {System.out.println(0); return;}
            else {
                // if day is greater than fine
                if(Integer.parseInt(dateR[0])>Integer.parseInt(dueD[0]))
                {System.out.println((Integer.parseInt(dateR[0])-Integer.parseInt(dueD[0]))*15);return;}
                else {System.out.println(0);
                }}}
    }
    }

