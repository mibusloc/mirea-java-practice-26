package ru.mirea.lab26.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        CustomList<String> iterator = new CustomList<>(stringList);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
