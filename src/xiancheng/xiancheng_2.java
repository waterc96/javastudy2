/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018��9��2��
 */
public class xiancheng_2 {
public static void main(String[] args) {
	new StudentT("��˼��").start();
	new StudentT("������").start();
	new StudentT("������").start();

}
}
class StudentT extends Thread{
	String name;
	private int applenum=50;
	public StudentT(String name) {
		//super(name);
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=50;i>0;i--) {
		System.out.println(this.name+"���ڳԵ�"+(applenum-i)+"��ƻ�� ");
		}
	}
	
}