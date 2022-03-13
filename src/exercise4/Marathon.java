package exercise4;

import java.util.Arrays;

public class Marathon {
    static void printResults(String[] names, int[] time){
        for (int i: time){
            System.out.println("Name: " + names[i] + ", Time: " + time[i]);
        }
    }

    public static void main(String[] args){
        String[] names = new String[]{"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int [] times = new int[]{341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265};

        printResults(names, times);
    }
}
