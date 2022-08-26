package com.cydeo.hRank;

import java.time.LocalDate;

public class GetDayOfWeek {
    public static void main(String[] args) {
        System.out.println(findDay(8,24,2022));
    }


    public static String findDay(int month, int day, int year) {
        if (year > 2000 && year < 3000) {
            LocalDate ld = LocalDate.of(year, month, day);
            return ld.getDayOfWeek().toString();
        }
        return null;
    }
}
