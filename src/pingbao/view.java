/**
 * 
 */
package pingbao;
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
public class view extends JFrame {
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public int getCavansHeight() {
		return cavansHeight;
	}
	public void setCavansHeight(int cavansHeight) {
		this.cavansHeight = cavansHeight;
	}
	public int getCavansWeight() {
		return cavansWidth;
	}
	public void setCavansWeight(int cavansWeight) {
		this.cavansWidth = cavansWeight;
	}
	private String tittle;
	private int cavansHeight;
	private int cavansWidth;
	public   qiuqiu[] yuans;
	public   void rend(qiuqiu[] yuans) {
		this.yuans=yuans;
	}
//	private final static int startWidth=400;
//	private final static int startHeight=300;
	//û�г�ʼ���壬�������������������塣
//	public myJframe(String tittle) {
//		this(tittle,startWidth,startHeight,null);
//	}
	public view(String tittle,int width,int height ,JPanel huabu) {
		super(tittle);
		this.tittle=tittle;
		this.cavansWidth=width;
		this.cavansHeight=height;
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
		qiuqiu[] qs = qiuqiu.yuans;
		myhuabu myhuabu=new myhuabu(true,qs);
		view myview=new view("��������", 600, 600,myhuabu);
		myview.rend(qs);
	}
}
class myhuabu extends JPanel{
	public qiuqiu[] yuans;
	//����˫����
	public myhuabu(boolean b,qiuqiu[] yuans) {
		super(b);
		this.yuans = yuans;
	}
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		//g2d.drawOval(33, 33, 33, 33);
		g2d.setColor(Color.BLUE);
		//���û��ʵĴ�ϸ
		g2d.setStroke(new BasicStroke(3));
		Huabi.openAA(g2d);
	
		for(qiuqiu s:yuans) {	
		Huabi.strokeCircle(g2d, s.getX(), s.getY(), s.r);
		
		}
	this.repaint();
	}
}