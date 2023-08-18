package org.launchcode;
import java.util.Scanner;

public class NumericTypesII {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nMiles Per Gallon Calculator\n");

        System.out.println("Number of miles driven: ");
        double numMilesDriven = input.nextDouble();

        System.out.println("\nAmount of gas consumed (gallons): ");
        double gallonsUsed = input.nextDouble();

        System.out.println("\nPrice of gas: ");
        double gasPrice = input.nextDouble();

        double milesPerGallon = numMilesDriven / gallonsUsed;
        double consumedGasPrice = gallonsUsed * gasPrice;

        System.out.println("\nMPG: " + milesPerGallon + "\nCost of gas used: " + consumedGasPrice);


    }
}
