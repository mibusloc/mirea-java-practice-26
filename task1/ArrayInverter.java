package ru.mirea.lab26.task1;

import java.util.Stack;

public class ArrayInverter {
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int value : array) {
            stack.push(value);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
}

