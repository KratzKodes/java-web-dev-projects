package org.launchcode;

import java.util.Scanner;

public class DVD extends BaseDisc implements OpticalDisc {

    private  String name;
    private  String contents;

    private  String capacity = "17 GB";

    private  String discType = "DVD";

    private  String spinSpeed = "10 RPM";

    private Scanner scanner = new Scanner(System.in);

    public DVD(String name, String contents, String capacity, String spinSpeed) {
        super();
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.spinSpeed = spinSpeed;
    }


    @Override
    public void writeData(String name, String contents) {
         name = scanner.nextLine();
         contents = scanner.nextLine();
    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {
       report();
    }

    @Override
    public void spin() {
        System.out.println("This disk is spinning");

    }

    @Override
    public void report() {
        System.out.println("Name: "+ this.name +"\n"+ "Capacity: "+ this.capacity + "\n" + "Contents: "+ this.contents+ "\nDisc Type: "+ this.discType ) ;


    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
