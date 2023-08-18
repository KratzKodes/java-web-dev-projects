package org.launchcode;

import java.util.Scanner;

public class NumericTypes {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle? ");
        int rectangleLength = input.nextInt();
        System.out.println("What is the width of your rectangle? ");
        int rectangleWidth = input.nextInt();
        System.out.println("Width: "+ rectangleWidth + " x " + "Length: "+ rectangleLength + " = " + (rectangleWidth*rectangleLength));
    }



}
