package day_2;
import java.math.BigInteger;
public class Zhengchu {
	public static void main(String args[]) {
		//String a="1000000";
		//String b="333333";
		long a=20*3600*1000000000001l;
		System.out.println(a);
		BigInteger a1=new BigInteger("100000000000000000000000000000001");
		BigInteger b2=new BigInteger("433333");
		System.out.print(b2.multiply(a1));//³Ë·¨
	}
}