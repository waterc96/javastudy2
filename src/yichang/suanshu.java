/**
 * 
 */
package yichang;

/**
 * @author daixuan
 *
 * 2018年8月23日
 */
public class suanshu {
	public static void main(String[] args) {
		System.out.println("开始");
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
