package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int result = dividend / divider;
            result *= divider;
            if (result == dividend) {
                System.out.println("can be divided completely");
            }
            else {
                System.out.println("cannot be divided completely");
            }
        }
        catch (ArithmeticException exc) {
            System.out.println("division by zero");
        }
    }

}
