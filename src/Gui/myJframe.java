package Gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author daixuan
 *
 * 2018��8��22��
 */
public class myJframe extends JFrame {
	public String getTittle() {
		return tittle;
	}
	/**
	 * @param tittle the tittle to set
	 */
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	/**
	 * @return the cavansHeight
	 */
	public int getCavansHeight() {
		return cavansHeight;
	}
	/**
	 * @param cavansHeight the cavansHeight to set
	 */
	public void setCavansHeight(int cavansHeight) {
		this.cavansHeight = cavansHeight;
	}
	/**
	 * @return the cavansWeight
	 */
	public int getCavansWeight() {
		return cavansWidth;
	}
	/**
	 * @param cavansWeight the cavansWeight to set
	 */
	public void setCavansWeight(int cavansWeight) {
		this.cavansWidth = cavansWeight;
	}

	private String tittle;
	private int cavansHeight;
	private int cavansWidth;
//	private final static int startWidth=400;
//	private final static int startHeight=300;
	/**
	 * 
	 */
	public myJframe() {
	}
	//û�г�ʼ���壬�������������������塣
//	public myJframe(String tittle) {
//		this(tittle,startWidth,startHeight,null);
//	}
	public myJframe(String tittle,int width,int height ,JPanel huabu) {
		//
		super(tittle);
		this.tittle=tittle;
		this.cavansWidth=width;
		this.cavansHeight=height;
		// �����壨JFrame��ȥ�趨��ߣ���������MenuBarҲռ���˲��ֿؼ�������������
		// �����������û��500��500��ô�࣬����Ӧ�ø�������Jpanel���趨��С
		// setSize(new Dimension(canvasWidth, canvasHeight));
		//mypanel mf=new mypanel();
		//���û�����С
		huabu.setPreferredSize(new Dimension(cavansWidth, cavansHeight));
		// ����������������
		setContentPane(huabu);
		// �����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ��֡�
		pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
	}
}
/*class mypanel extends JPanel{

	private int x=100;
	private int y=100;
	int width=5;
	private int  O_width=30;
	private int  O_height=30;
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d=(Graphics2D)g;
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
		
	}
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
//	@Override
//	protected void paintComponent(Graphics g) {
//		// TODO Auto-generated method stub
//		super.paintComponent(g);
//		Graphics2D g2d=(Graphics2D)g;
//		Ellipse2D yuan1=new Ellipse2D.Float(100f,100f,30f,30f);
//		g2d.draw(yuan1);
//	
//	}
//}
//
