package com.cydeo.hRank;

public class AnagramStreamChars {
    public static void main(String[] args) {
        String sorted = "bdca".chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

      String an1="banana".chars()
              .sorted()
              .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append)
              .toString();
      String an2="ananab".chars()
              .sorted()
              .collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append)
              .toString();
      if(an1.equals(an2)) System.out.println("Anagram");
      else System.out.println("Not an anagram");
    }
}
