/**
 * 
 */
package Gui;
/**
 * @author daixuan
 *
 * 2018年8月23日
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class testStar {

    /**
     * @param args
     * 满天星星图
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame jf=new JFrame();
        jf.setSize(600, 600);
        jf.setBackground(Color.BLACK);
        //jf.add(new testStar());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(new ShapesPanel());
        jf.setTitle("满天星星");
    	jf.setResizable(false);
     /*public void paint(Graphics g){
        GraphicsDemod myGrapics=new GraphicsDemod();
        myGrapics.paintComponent(g);
    }*/
}
}
class ShapesPanel extends JPanel{
    public void paintComponent(Graphics g){
    int placeX;
    int placeY;
    int size;//存放字体大小，星星是直接输出的*，用字体控制起大小
        //画星星
    for(int i=0;i<300;i++){
        //Math是数学类，random（）是Math类中的一个方法，random本身只产生（0~1）之间的小数，
        //random（）*10 意思是产生0~10之间的小数   ，
        //int(random（）*10)的意思是强制取整，把小数部分去掉只去整数部分，所以 就变成了  产生0~9之间的整数。
        placeX=(int) (600*Math.random());
        placeY=(int)(600*Math.random());
        size=(int)(50*Math.random());
        g.setColor(Color.white);
    
        g.drawString("*", placeX, placeY);//在X,Y的位置处画上特定的符号*
        }
    //画月亮
        placeX=(int) (100*Math.random());
        g.fillOval(placeX, 100, 100, 100);//placeX,100是圆心坐标（确切说是椭圆的中心对称点）的x，y值，后面两个是两条半长轴的长度。
        //filloval画的是椭圆，后面两个相等当然就是圆了
        g.setColor(Color.black);
        g.fillOval(placeX-20, 80, 100, 100);
        //画地面
        g.setColor(Color.white);
        g.fillOval(-400, 710, 1000, 100);
}
}