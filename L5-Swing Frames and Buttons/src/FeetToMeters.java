import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

    /*
    THE PLAN:
    1. CREATE GUI
    2. GET INPUT, WHEN A BUTTON IS CLICKED
    3. CALCULATE - 3.28 FEET IN A METER.
    FT --> M = DIVIDE BY 3.28.
    M --> FT = MULTIPLY BY 3.28.
    4. DISPLAY RESULTS AFTER EACH BUTTON IS PRESSED.
     */


    public static void main(String[] args) {

        JFrame window = new JFrame("Feet to Meters Conversion");

        JPanel convert = new JPanel();

        JButton convertToFeet = new JButton("Feet to Meters Conversion");

        JButton convertToMeters = new JButton("Meters to Feet Conversion");


        window.setSize(600, 300);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        window.setLocationRelativeTo(null);

        convertToFeet.addActionListener(new FeetToMeters.ButtonListener1());
        convertToMeters.addActionListener(new FeetToMeters.ButtonListener2());


        convert.add(convertToFeet);
        convert.add(convertToMeters);
        window.add(convert);

        window.setVisible(true);
    }
    private static class ButtonListener1 implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double feet = Double.parseDouble(JOptionPane.showInputDialog("What is your distance in feet?"));
            double convertedToMeters = feet/3.28;
            JOptionPane.showMessageDialog(null,"Your new distance in meters is: " + convertedToMeters);


        }
    }

    private static class ButtonListener2 implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double meters = Double.parseDouble(JOptionPane.showInputDialog("What is your distance in meters?"));
            double convertedToFeet = meters * 3.28;
            JOptionPane.showMessageDialog(null, "Your new distance in feet is: ?" + convertedToFeet);
        }

    }
}
