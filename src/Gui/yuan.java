/**
 * 
 */
package Gui;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author daixuan
 *
 * 2018��8��23��
 */
public class yuan {
	static final String name="����";
	static final int huawidth=600;
	static final int huaheight=600;
	public yuan() {}
	public static void main(String[] args) {
		myhua mh=new myhua(50, 50, 20,10);
		myJframe jframe=new myJframe("����",huawidth,huaheight,mh);
	}
}
class myhua extends JPanel{
	int r;
	int x;
	int y;
	int vx;
	int vy;
	int yuan_count;
	//public static myhua[] yuans=new myhua(1, 1, 1);
//	yuans=new [myhua];	
	 /**@param x Բ�ĵ�x����
	 * @param y Բ�ĵ�y����
	
	 * @param r Բ�İ뾶
	 *  @param yuan_count Բ������
	 */
	public myhua(int x,int y,int r,int yuan_count) {
		this.x=x;
		this.y=y;
		this.r=r;
		this.vx=vx;
		this.vy=vy;
		this.yuan_count=yuan_count;
		//super.paint();
	}
	//����˫����
	public myhua(boolean b) {
		super(b);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		int suix=(int)(Math.random()*(600-2*r+1)+r);
		int suiy=(int)(Math.random()*(600-2*r+1)+r);
		for(int i=0;i<yuan_count;i++) {
		g.drawOval(suix+r, suiy+r, 2*r, 2*r);
		this.repaint();
		}
		
	}

}