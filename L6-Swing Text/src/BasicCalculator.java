import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */



    static JTextField inputField1;
    static JTextField inputField2;
    static JLabel resultLabel;



    public static void main(String[] args) {

        JFrame window = new JFrame("Basic Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("What is your first number? ");
        JLabel inputLabel2 = new JLabel("What is your second number? ");

         inputField1 = new JTextField(10);
         inputField2 = new JTextField(10);


        JButton addButton = new JButton("Click For Addition");
        JButton subtractButton = new JButton("Click For Subtraction");
        JButton multiplyButton = new JButton("Click For Multiplication");
        JButton divideButton = new JButton("Click For Division");

        resultLabel = new JLabel("0.00");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        addButton.addActionListener(new BasicCalculator.ButtonListenerAdd());
        subtractButton.addActionListener(new BasicCalculator.ButtonListenerSubtract());
        multiplyButton.addActionListener(new BasicCalculator.ButtonListenerMultiply());
        divideButton.addActionListener(new BasicCalculator.ButtonListenerDivide());


        panel.add(inputLabel1);
        panel.add(inputField1);

        panel.add(inputLabel2);
        panel.add(inputField2);

        panel.add(resultLabel);

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);


        window.add(panel);
        window.setVisible(true);


    }



    private static class ButtonListenerAdd implements ActionListener{

        /*

            1. GET INPUT - FROM THE TEXT FIELD
            2. ADD NUMBERS
            3. OUTPUT TO THE RESULT LABEL

         */

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());


            resultLabel.setText(String.valueOf(number1 + number2));

        }
    }


    private static class ButtonListenerSubtract implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());


            resultLabel.setText(String.valueOf(number1 - number2));

        }
    }


    private static class ButtonListenerMultiply implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());


            resultLabel.setText(String.valueOf(number1 * number2));

        }
    }


    private static class ButtonListenerDivide implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());


            resultLabel.setText(String.valueOf(number1/number2));

        }
    }



}
