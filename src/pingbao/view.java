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
 * 2018年8月22日
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
	//没有初始画板，所以这个构造参数无意义。
//	public myJframe(String tittle) {
//		this(tittle,startWidth,startHeight,null);
//	}
	public view(String tittle,int width,int height ,JPanel huabu) {
		super(tittle);
		this.tittle=tittle;
		this.cavansWidth=width;
		this.cavansHeight=height;
		//设置画布大小
		huabu.setPreferredSize(new Dimension(cavansWidth, cavansHeight));
		// 将画布贴到画板上
		setContentPane(huabu);
		// 调整此窗口的大小，以适合其子组件的首选大小和布局。
		pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
		qiuqiu[] qs = qiuqiu.yuans;
		myhuabu myhuabu=new myhuabu(true,qs);
		view myview=new view("屏保球球", 600, 600,myhuabu);
		myview.rend(qs);
	}
}
class myhuabu extends JPanel{
	public qiuqiu[] yuans;
	//开启双缓冲
	public myhuabu(boolean b,qiuqiu[] yuans) {
		super(b);
		this.yuans = yuans;
	}
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		//g2d.drawOval(33, 33, 33, 33);
		g2d.setColor(Color.BLUE);
		//设置画笔的粗细
		g2d.setStroke(new BasicStroke(3));
		Huabi.openAA(g2d);
	
		for(qiuqiu s:yuans) {	
		Huabi.strokeCircle(g2d, s.getX(), s.getY(), s.r);
		
		}
	this.repaint();
	}
}