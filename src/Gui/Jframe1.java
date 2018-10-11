package Gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Jframe1 {
	public static int size=5;
	public static ArrayList<Sanke> she=new ArrayList<>();
	public static void main(String[] args) {
		JFrame jf =new JFrame();
		myhuaban mp= new myhuaban();
		jf.setSize(800,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(mp);
		jf.addKeyListener(mp);
		int toux=Sanke.rfoodx();
		int touy=Sanke.rfoody();
		//she.add(new Sanke(toux,touy,size));
	}
}
class myhuaban extends JPanel implements KeyListener{
	Sanke s=new Sanke();
	Jframe1 jf=new Jframe1();
	int x=s.x;
	int y=s.y;
	int rx=Sanke.rfoodx();
	int ry=Sanke.rfoody();
	int size=1;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(int line_x=0;line_x<=800;line_x=line_x+30) {
			g.drawLine(line_x, 0, line_x,500 );
			}
		for(int line_y=0;line_y<=500;line_y+=30) {
				g.drawLine(0, line_y, 800,line_y);
				}
		g.drawOval(s.x+30, s.y, 30, 30);
		g.drawOval(s.x+60, s.y, 30, 30);
		g.drawOval(s.x+90, s.y, 30, 30);
		g.drawOval(s.x+120, s.y, 30, 30);
		Graphics2D g2d=(Graphics2D) g;
		//画的蛇头
		g2d.setColor(Color.yellow);
		Ellipse2D e2d1 = new Ellipse2D.Float(s.x, s.y, 30, 30);
		g2d.fill(e2d1);
		//画的食物
		g2d.setColor(Color.blue);
		Ellipse2D e2d2 = new Ellipse2D.Float(rx, ry, 30, 30);
		g2d.fill(e2d2);
		if(s.eat()) {
			s.add();
			for(Sanke s:Jframe1.she) {
				g.drawOval(s.x+120+size*30, s.y, 30, 30);
				size++;
			}
			}
		this.repaint();
		
//		for(Sanke s:Jframe1.she) {
//			if(s.x==Jframe1.she.get(0).x&&s.y==Jframe1.she.get(0).y) {
//				g.setColor(Color.yellow);
//				g.drawOval(s.x, s.y, 30, 30);
//			}
//		g.drawOval(s.x+size*30, s.y, 30, 30)		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
//		while(x<800&&y<500) {
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			s.y+=30;
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			s.y-=30;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			s.x-=30;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			s.x+=30;
		}
		//调用repaint函数，来重绘界面
		this.repaint();
		// TODO Auto-generated method stub
		
	}
//	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
