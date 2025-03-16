package org.example.CollectionExamples;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // time complexity
        // O(1) for get() set(), size(), isEmpty(),iterator(), listIterator()
        // O(n) for contains(), indexOf(),
        // O(n2) or worse for removeAll(), retainAll()
        ArrayList<Integer> list = new ArrayList<>();

        //ArrayList allows duplicates and null values
        // Search take o(1)
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(2);
        list.add(null);

        System.out.println(list);

        //Search operations
        System.out.println(list.get(2));
    }

}
