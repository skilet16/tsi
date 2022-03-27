package lv.tsi.lamda;

import java.util.List;

public class ListProcessingWithStreams {

    public static void main(String[] args){
        String[] list = { "a1", "c3", "a2", "a3","b3", "b2", "c1", "c2","b1"};

        List<String> lists = new java.util.ArrayList<>(List.of(list));
        // Exercise 1 Get first element
        System.out.print(lists.get(0));
        System.out.print("\n");
        // Exercise 2 Get all elements and convert to uppercase
        lists.replaceAll(String::toUpperCase);
        System.out.print(lists);
        System.out.print("\n");
        // Exercise 3 Get elements that starts with b
        for (String value: lists) {
            if (value.startsWith("B")) {
                System.out.print(value + " ");
            }
        }
        System.out.print("\n");
        // Exercise 4 Get elements that starts with c with uppercase
        for (String value: lists) {
            if (value.startsWith("C")) {
                System.out.print(value + " ");
            }
        }
    }

}
