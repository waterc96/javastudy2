/**
 * 
 */
package Gui;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author daixuan
 *
 * 2018年8月23日
 */
public class yuan {
	static final String name="动画";
	static final int huawidth=600;
	static final int huaheight=600;
	public yuan() {}
	public static void main(String[] args) {
		myhua mh=new myhua(50, 50, 20,10);
		myJframe jframe=new myJframe("动画",huawidth,huaheight,mh);
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
	 /**@param x 圆心的x坐标
	 * @param y 圆心的y坐标
	
	 * @param r 圆的半径
	 *  @param yuan_count 圆的数量
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
	//开启双缓冲
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