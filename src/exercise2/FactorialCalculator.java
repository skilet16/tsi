package exercise2;

import java.util.Scanner;

public class FactorialCalculator {
    public static double factorialRecursion(double number){
        if (number == 0){
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

    public static double factorialFor(double number){
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:  ");
        double userInput = input.nextDouble();

        double factorialFirst = factorialFor(userInput);
        double factorialSecond = factorialRecursion(userInput);

        System.out.println("Factorial input: " + userInput);
        System.out.println("Loop method result: " + factorialFirst);
        System.out.println("Recursion method result: " + factorialSecond);
    }

}
