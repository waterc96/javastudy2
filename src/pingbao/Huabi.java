package pingbao;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

public class Huabi {
	public Huabi() {}

	/**
	 * ��һ�����ĵ�԰
	 * 
	 * @param g2d ����
	 * @param x   Բ�ĵĺ�����
	 * @param y   Բ�ĵ�������
	 * @param r   Բ�İ뾶
	 */
	public static void strokeCircle(Graphics2D g2d, int x, int y, int r) {
		Ellipse2D e2d = new Ellipse2D.Float(x - r, y - r, 2 * r, 2 * r);
		g2d.draw(e2d);
	}
//ʵ��Բ
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
	
	
	

