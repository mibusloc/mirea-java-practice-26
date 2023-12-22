package ru.mirea.lab26.task1;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Initial array:");
        ArrayInverter.printArray(originalArray);

        ArrayInverter.invertArray(originalArray);

        System.out.println("\nInverted array:");
        ArrayInverter.printArray(originalArray);
    }
}
