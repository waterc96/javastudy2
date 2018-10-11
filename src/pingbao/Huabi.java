package pingbao;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

public class Huabi {
	public Huabi() {}

	/**
	 * 画一个空心的园
	 * 
	 * @param g2d 画笔
	 * @param x   圆心的横坐标
	 * @param y   圆心的纵坐标
	 * @param r   圆的半径
	 */
	public static void strokeCircle(Graphics2D g2d, int x, int y, int r) {
		Ellipse2D e2d = new Ellipse2D.Float(x - r, y - r, 2 * r, 2 * r);
		g2d.draw(e2d);
	}
//实心圆
	public static void fillCircle(Graphics2D g2d, int x, int y, int r) {
		Ellipse2D e2d = new Ellipse2D.Float(x - r, y - r, 2 * r, 2 * r);
		g2d.fill(e2d);

	}

	public static void openAA(Graphics2D g2d) {
		RenderingHints rh=new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
	    g2d.addRenderingHints(rh);
	}
	public static void sleep() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	
	
	

