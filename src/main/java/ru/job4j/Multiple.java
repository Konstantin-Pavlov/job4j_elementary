package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        byte multiplier = 1;
        byte limit = 10;
        for (int i = 1; i < limit; i++) {
            System.out.printf("%d * %d = %d\n", multiplier, i, multiplier * i);
        }
    }
}
