package ru.mirea.lab26.task3;

public class Main {
    public static void main(String[] args) {
        CustomList<String> linkedList = new CustomList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
