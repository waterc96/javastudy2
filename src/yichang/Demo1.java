/**
 * 
 */
package yichang;

import java.util.ArrayList;

/**
 * @author daixuan
 *
 * 2018年8月28日
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list=null;
		System.out.println("beghin");

		try {
			int a = 10;
			int b = 2;
			int c = a / b;
			System.out.println(c);
			list.add("java");
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}  
		System.out.println("end");
		method();

	}
	//finally中不要写return
	public static int method() {
		try {
			int a=8/4;
		return a;	
		}finally{
			return 01;
		}
	}

}
