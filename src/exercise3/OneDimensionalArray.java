package exercise3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class OneDimensionalArray {

    public static double[] createRandomArray(int size) {
        Random random = new Random();
        double[] array = new double[size];

        for (int i = 0; i < size; i++){
            array[i] = random.nextDouble(100);
        }

        return array;
    }

    public static double averageArray(double[] array){
        double combinedValues = 0;
        int count = 0;

        for (double value : array) {
            combinedValues += value;
            count++;
        }

        return combinedValues / count;
    }

    public static void main(String[] args){
        double maxValue = 101, minValue = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();

        double[] doubleArray = createRandomArray(size);
        double average = averageArray(arrayDoub);

        for (int i = 0; i < size; i++){
            if (doubleArray[i] > 0){
                maxValue = doubleArray[i];
            }
            if (doubleArray[i] < 101){
                minValue = doubleArray[i];
            }
        }

        System.out.println("The array: " + Arrays.toString(doubleArray));
        System.out.println("Average value: " + average);
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }



}
