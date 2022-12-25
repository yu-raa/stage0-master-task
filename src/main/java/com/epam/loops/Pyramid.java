package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                sb.append(" ");
            }
            for (int j = i; j >= 1; j--) {
                sb.append(j);
            }
            for (int j = 2; j <= i; j++) {
                sb.append(j);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
