import java.util.Scanner;

public class Area {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius of a circle:");

        double circleRadius = 0;

        try{
            while (circleRadius <= 0){
                System.out.println("Please select a number to calculate the area of a circle:");
                circleRadius = input.nextDouble();
            }
            input.close();
            double areaOfCircle = Circle.getArea(circleRadius);

            String phrase = String.format("The area of a circle with a radius %f: is %f ",circleRadius,areaOfCircle);
            System.out.println(phrase);

        }catch (Exception e){
            System.out.println("Invalid Input\n**Program Closed**");
        }
    }
}