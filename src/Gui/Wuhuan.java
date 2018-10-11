/**
 * 
 */
package Gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.renderable.RenderableImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author daixuan
 *
 * 2018年8月22日
 */
public class Wuhuan {

	public static void main(String[] args) {
		drawO oo=new drawO();
		myJframe huan=new myJframe("奥运五环",500,500,oo);
		//huan.add(new mypanel());
		
	}
}
class drawO  extends JPanel{
	private int x=100;
	private int y=100;
	int width=5;
	private int  O_width=30;
	private int  O_height=30;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d=(Graphics2D)g;

		//g2d.addRenderingHints(hints);
		g2d.setStroke(new BasicStroke(width));
		g2d.setColor(Color.blue);
		g2d.drawOval(x-15, y, O_width, O_height);
		g2d.setColor(Color.black);
		g2d.drawOval(x+15, y, O_width, O_height);
		g2d.setColor(Color.red);
		g2d.drawOval(x+45, y, O_width, O_height);
		g2d.setColor(Color.yellow);
		g2d.drawOval(x+5, y+15, O_width, O_height);
		g2d.setColor(Color.green);
		g2d.drawOval(x+30, y+15, O_width, O_height);
		Ellipse2D yuan1=new Ellipse2D.Float(200f,200f,50f,50f);
	    g2d.draw(yuan1);
	    g2d.drawOval(15, 15, 30, 30);
	}	
}
