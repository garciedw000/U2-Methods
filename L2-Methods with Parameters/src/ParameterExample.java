import javax.swing.*;

public class ParameterExample {

    public static void main(String[] args) {

        //double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width?"));
        //double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));
        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width"));

        areaRect(width, length);
        perimeterRect(width, length);
    }


    public static void areaRect(double width, double length) {

        double area = width * length;
        JOptionPane.showMessageDialog(null, "The area is " + area);
    }

    public static void perimeterRect(double width, double length) {

        double perimeterRect = (2 * width) + (2 *length);
        JOptionPane.showMessageDialog(null, "The area is " + perimeterRect);
    }

}
