import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;

    public ArtworkGUI(){
        frame = new JFrame("Simple Drawing");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new DrawingPanel();


        frame.add(panel);
        frame.setVisible(true);
    }

    private class DrawingPanel extends JPanel{

        //Constructor for the class
        public DrawingPanel(){
            //set the Background color
            setBackground(Color.cyan);



        }


        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(Color.white);
            g.fillRect(30,200,200,50);

            g.setColor(Color.blue);
            g.fillRect(30,250,200,50);

            g.setColor(Color.RED);
            g.fillRect(30,300,200,50);

            Color brown = new Color(72,52,52);
            g.setColor(brown);
            g.fillRect(30,200,20,350);

            g.setColor(Color.red);
            g.fillRect(200,400,150,150);

            g.setColor(Color.black);
            g.fillRect(250,500,30,50);

            Color grayish = new Color(98,131,149);
            g.setColor(grayish);
            g.fillRect(220,435,35,35);
            g.fillRect(290,435,35,35);
            g.fillRect(255,525,5,5);

            g.setColor(Color.darkGray);
            g.fillRect(170,400,210,20);
            g.fillRect(217,370,120,30);
            g.fillRect(243,340,70,30);

            g.setColor(Color.GREEN);
            g.fillRect(0,550,400,10);




        }


    }
}
