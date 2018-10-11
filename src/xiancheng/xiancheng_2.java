/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018年9月2日
 */
public class xiancheng_2 {
public static void main(String[] args) {
	new StudentT("成思潮").start();
	new StudentT("梁玉民").start();
	new StudentT("罗明智").start();

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
		System.out.println(this.name+"正在吃第"+(applenum-i)+"个苹果 ");
		}
	}
	
}