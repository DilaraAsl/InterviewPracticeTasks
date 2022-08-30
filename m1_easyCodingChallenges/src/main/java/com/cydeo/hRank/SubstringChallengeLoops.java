package com.cydeo.hRank;

public class SubstringChallengeLoops {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometoJava",3));
    }
    public static String getSmallestAndLargest(String s, int k) {

       String smallest=s.substring(0,k);
       String largest=s.substring(0,k);

        for (int i = 1; i < s.length()-k+1; i++) { // smallest and largest are already assigned to the first substring
            // final value of i should be 10 s.length 13 k 3
             if(s.substring(i,i+k).compareTo(smallest)<0)
                 smallest=s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest)>0)
                largest=s.substring(i,i+k);
        }
        return smallest+"\n"+largest;
    }
}
