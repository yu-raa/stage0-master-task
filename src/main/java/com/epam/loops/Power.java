package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int num = numberToPrint;
        for (int i = 1; i < Math.abs(power); i++) {
            numberToPrint *= num;
        }
        if (power < 0) {
            numberToPrint = 1/numberToPrint;
        }

        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
