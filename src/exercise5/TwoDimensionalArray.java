package exercise5;

import java.util.Scanner;
import java.util.Random;

public class TwoDimensionalArray {
    public static int[][] createRandomArray(int size){
        Random rd = new Random();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                array[i][j] = rd.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public static void averageColumn(int[][] array){
        double average = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                average += array[j][i];
                count++;
            }

            System.out.println("Column: " + i + " , Average: " +  (average / count));

            average = 0; count = 0;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Size of array: ");
        int inputSize = input.nextInt();

        int[][] intArray = createRandomArray(inputSize);
        averageColumn(intArray);
    }
}