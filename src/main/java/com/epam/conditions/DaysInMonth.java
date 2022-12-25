package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year >= 0 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println("31");
        }
        else if (year >= 0 && month > 0 && month < 13 && month != 2) {
            System.out.println("30");
        }
        else if (year >= 0 && month == 2 && year % 4 == 0 && (year % 100 != 0 || year % 100 == 0 && year % 400 == 0)) {
            System.out.println("29");
        }
        else if (year >= 0 && month == 2) {
            System.out.println("28");
        }
        else {
            System.out.println("invalid date");
        }
    }

}
