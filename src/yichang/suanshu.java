/**
 * 
 */
package yichang;

/**
 * @author daixuan
 *
 * 2018��8��23��
 */
public class suanshu {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		int a =0;
		int b=10;
		int c=b/a;
		try {
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
	
		System.out.println("over");}
	}

}
