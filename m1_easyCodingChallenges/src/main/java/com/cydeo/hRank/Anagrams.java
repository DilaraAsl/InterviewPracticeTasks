package com.cydeo.hRank;

public class Anagrams {
    public static void main(String[] args) {
        String a="anagram";
        String b="margana";

        System.out.println(isAnagram(a,b));
    }
    static boolean isAnagram(String a, String b) {

        // Complete the function

        if(a.length()!=b.length()) return false;
        a=a.toLowerCase();
        a=a.trim();
        b=b.toLowerCase();
        b=b.trim();

        for (int i = 0; i < a.length(); i++) {
            if(b.contains(a.charAt(i)+"")){
               b= b.replace(b.charAt(b.indexOf(a.charAt(i)))+"","");
            }


        }
        if(b.isEmpty()) return true;
        return false;
    }
}
