package Gui;
import javax.swing.*;
import java.awt.*;
public class jframe2 {
	    public static void main(String args[]) {
	        LabT gui = new LabT();
	        gui.go();
	    }
}
@SuppressWarnings("serial")
class myG extends JLabel
	{
	    public void paint(Graphics g)
	    {
			g.drawOval(35, 30, 100, 35);
			g.drawString("Hello World!",50, 50);
		}
	}
class LabT{
	    public void go() {
	        JFrame frame = new JFrame("Hello");
	        myG ll=new myG();
	        frame.add(ll);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(200,200);
	        frame.setVisible(true);
	    }
	}
	 

