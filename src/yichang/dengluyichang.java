/**
 * 
 */
package yichang;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author daixuan
 *
 * 2018年8月23日
 */
public class dengluyichang {
	static HashSet<Integer>num=new HashSet();
	
	public static void main(String[] args) {
		num.add(123);
		num.add(234);
		
	try {
		test();
	} catch (LoginException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}
	public static void test() throws LoginException {
	
			System.out.println("请输入3个数");
			Scanner sc=new Scanner(System.in);
			int mima=sc.nextInt();
			for(Integer i:num) {
				if(mima==i) {
					throw new LoginException(i+"不行");
				}
			}
			System.out.println("ok");
		
	} 

}
class LoginException extends Exception {
	private static final long serialVersionUID = 1L;

	public LoginException() {
		super();
	}

	public LoginException(String s) {
		super(s);
	}

}
