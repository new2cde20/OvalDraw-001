// Author: Janeise Davis

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;

class Oval extends JPanel {
    Oval() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //g.fillRect(1,1,200,200); // This gave me a rectangle that was underneath the oval I originally drew

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // To put a rectangle behind your Oval
        Color rectColor = new Color(0,255,0);
        g.setColor(rectColor);
        g.fillRect(0,0,panelWidth, panelHeight);

        Color myColor = new Color(255,0,0);
        g.setColor(myColor);
        g.fillOval(0,0,panelWidth, panelHeight); //Originally was (0,0,100,100)
    }    
}

class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDraw");
        setBounds(300,300,400,500);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oval myOval = new Oval();
        Container contentPane = getContentPane();
        contentPane.add(myOval);
    }

}
public class OvalDraw {
    public static void main(String[] args) {
        System.out.println("Starting OvalDraw...");

        OvalFrame myFrame = new OvalFrame();
        myFrame.setVisible(true);
    }
}