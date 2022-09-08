package com.cydeo.hRank;

public class CalculateScores {
    public static void main(String[] args) {
        int[] testScores={100,80};

        System.out.println( calculate(testScores));
    }

    public static char calculate(int[] testScores){
        int sum=0;
        for(int each:testScores){
            sum+=each;
        }
        int result=(int)Math.round(sum/(testScores.length*1.0));
        System.out.println(result);
        if(result>=90&& result<=100) return 'O';
        else if(result>=80&& result<90) return 'E';
        else if(result>=70&& result<80) return 'A';
        else if(result>=55&& result<70) return 'P';
        else if(result>=40&& result<50) return 'D';
        else if(result<40) return 'T';

        return '\u0000';
    }
}
