import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window;
    JPanel panel;
    JButton colorClicker;
    JButton colorChanger1;
    JButton colorChanger2;


    Color panelBackground1 = new Color(189,22,22);
    Color buttonForeground1 = new Color(202,217,179);
    Color buttonBackground1 = new Color(240,165,0);

    Color panelBackground2 = new Color(100,40,42);
    Color buttonForeground2 = new Color(150,220,179);
    Color buttonBackground2 = new Color(200,165,100);

    Color panelBackground3 = new Color(180,202,22);
    Color buttonForeground3 = new Color(22,217,179);
    Color buttonBackground3 = new Color(240,165,100);


    public ColorSwitchGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 200);
        window.setLocationRelativeTo(null);

        panel = new JPanel();

        colorClicker = new JButton("Change The Colors");
        colorChanger1 = new JButton("Change To A Different Color");
        colorChanger2 = new JButton("Change To A Different Color");




        colorClicker.addActionListener(new ColorChanger());
        colorChanger1.addActionListener(new ColorSwitch1());
        colorChanger2.addActionListener(new ColorSwitch2());


        panel.setBackground(panelBackground1);
        colorClicker.setForeground(buttonForeground1);
        colorClicker.setBackground(buttonBackground1);



        panel.add(colorClicker);
        panel.add(colorChanger1);
        panel.add(colorChanger2);
        window.add(panel);

        window.setVisible(true);
    }



    private class ColorChanger implements ActionListener{

        public void actionPerformed(ActionEvent e){
            panel.setBackground(buttonBackground1);
            colorClicker.setForeground(buttonForeground1);
            colorClicker.setBackground(panelBackground1);

        }
    }

    private class ColorSwitch1 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            panel.setBackground(buttonBackground2);
            colorChanger1.setForeground(buttonForeground2);
            colorChanger1.setBackground(panelBackground2);

        }
    }

    private class ColorSwitch2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            panel.setBackground(buttonBackground3);
            colorChanger2.setForeground(buttonForeground3);
            colorChanger2.setBackground(panelBackground3);
        }
    }


}