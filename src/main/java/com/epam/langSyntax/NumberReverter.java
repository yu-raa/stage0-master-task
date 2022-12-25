package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int numCopy = number;
        number = 0;
        while (numCopy >= 1) {
            number *= 10;
            number += numCopy % 10;
            numCopy /= 10;
        }
        System.out.println(number);
    }

}
