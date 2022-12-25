package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int numCopy = number;
        number = 0;
        while (numCopy >= 1) {
            number += numCopy % 10;
            numCopy /= 10;
        }
        System.out.println(number);
    }

}
