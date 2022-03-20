package exercise1;

import java.util.Scanner;

public class GravityCalculator {
    static final double GRAVITY = 9.81;
    private int fallingTime = 0;
    private double initialPosition, initialVelocity = 0;

    public GravityCalculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        double finalPosition = (this.fallingTime * this.fallingTime) * GRAVITY * 0.5 + this.initialVelocity * this.fallingTime + initialPosition;
        System.out.println ("Position in" + fallingTime + "seconds:" + finalPosition);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter falling time: ");
        int fallTime = input.nextInt();
        System.out.print("Enter initial position: ");
        double position = input.nextDouble();
        System.out.print("Enter velocity: ");
        double velocity = input.nextDouble();

        GravityCalculator calculator = new GravityCalculator(fallTime ,position, velocity);
        calculator.calculate();
    }


}
