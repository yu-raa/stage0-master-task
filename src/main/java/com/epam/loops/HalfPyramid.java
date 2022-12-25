package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                sb.append(" ");
            }
            for (int j = i; j >= 1; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
