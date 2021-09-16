import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //create and run the program

        //Step 1
        double radius = getInput("Please enter the radius.");

        //Step 2
        double area = area(radius);

        //Step 3
        double perimeter = perimeter(radius);

        //Step 4
        JOptionPane.showMessageDialog(null, displayResults(area, perimeter));


        System.exit(0);

    }


    //Method to get input from user
    public static double getInput(String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));

    }


    //re-write the method to calculate a circle's area using parameters and return statement

    public static double area(double radius){

        return radius * radius * Math.PI;

    }


    //re-write the method to calculate a circle's perimeter using parameters and return statement

    public static double perimeter(double radius){

        return 2 * radius * Math.PI;
    }


    public static String displayResults(double area, double perimeter){

        DecimalFormat round = new DecimalFormat("#.##");
        String message = "The area is: " + round.format(area);
        message += "\nThe perimeter is: " + round.format(perimeter);

        return message;

    }


}
