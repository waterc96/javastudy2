/**
 * 
 */
package Gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

/**
 * @author daixuan
 *
 * 2018年8月26日
 */
public class Sanke  {

	public int x=rfoodx();
	 int y=rfoody();
	 int fx=rfoodx();
	 int fy=rfoody();
	 int size=5;//初始长度
	 int speed=5;//初始速度
	/**
	 * @return 
	 * 
	 */
	/**
	 * 
	 */
	public Sanke() {}
	public Sanke(int x,int y,int size) {
			this.x=x;
			this.y=y;
			this.size=size;
	}
public static int rfoodx() {
	int foodx=(int)(Math.random()*400);
	if(foodx%15==0&&foodx%10==0) {
		return foodx;
	}else {
		return rfoodx();
	}
}
public static  int rfoody() {
	int foody=(int)(Math.random()*300);
if(foody%15==0&&foody%10==0) {
	return foody;
}else {
	return rfoody();
}
}
static boolean b;
public  boolean eat() {
	if(x==fx-15||x==fx+15||y==fy-15||y==fy+15) {
	return	b=true;
	}else
	return	b=false;
}
public  void add() {
	Jframe1.she.add(new Sanke(Sanke.rfoodx(),Sanke.rfoody(), size));
}
}
