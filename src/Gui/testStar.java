/**
 * 
 */
package Gui;
/**
 * @author daixuan
 *
 * 2018��8��23��
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
     * ��������ͼ
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
        jf.setTitle("��������");
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
    int size;//��������С��������ֱ�������*��������������С
        //������
    for(int i=0;i<300;i++){
        //Math����ѧ�࣬random������Math���е�һ��������random����ֻ������0~1��֮���С����
        //random����*10 ��˼�ǲ���0~10֮���С��   ��
        //int(random����*10)����˼��ǿ��ȡ������С������ȥ��ֻȥ�������֣����� �ͱ����  ����0~9֮���������
        placeX=(int) (600*Math.random());
        placeY=(int)(600*Math.random());
        size=(int)(50*Math.random());
        g.setColor(Color.white);
    
        g.drawString("*", placeX, placeY);//��X,Y��λ�ô������ض��ķ���*
        }
    //������
        placeX=(int) (100*Math.random());
        g.fillOval(placeX, 100, 100, 100);//placeX,100��Բ�����꣨ȷ��˵����Բ�����ĶԳƵ㣩��x��yֵ�����������������볤��ĳ��ȡ�
        //filloval��������Բ������������ȵ�Ȼ����Բ��
        g.setColor(Color.black);
        g.fillOval(placeX-20, 80, 100, 100);
        //������
        g.setColor(Color.white);
        g.fillOval(-400, 710, 1000, 100);
}
}