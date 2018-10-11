/**
 * 
 */
package Gui;

import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JPanel;

/**
 * @author daixuan
 *
 * 2018年8月23日
 */
public class Star1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mypanle mp =new mypanle();
	myJframe star=new myJframe("五角星",500,500,mp);

	}

}
class mypanle extends JPanel{
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.draw3DRect(55, 65, 10, 20, true);
	}
	
}