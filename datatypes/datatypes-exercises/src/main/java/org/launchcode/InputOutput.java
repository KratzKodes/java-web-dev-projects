package org.launchcode;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = input.nextLine();
        System.out.println("Hello, "+ userName);
    }
    }

