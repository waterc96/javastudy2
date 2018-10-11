package day_2;
import java.util.*;
import java.math.*;

public class kuo_2 {

	public static void main(String[] args) {
		//数据交换1
		int a=10;
		int b=20;
//		int temp=a;
//		a=b;
//		b=temp;
	//	System.out.println(b+"            "+a);
		//数据交换2
		 a=a+b;
		 b=a-b;
		 a=(a+b)/2;
		 System.out.println(b+"            "+a);
		 Scanner t=new Scanner(System.in);
		 System.out.println("请输入自由落体的时间");
		 double t1=t.nextDouble();
		// double s1=(double)s;
		 double s;
		 double g=9.80;
		 
		 System.out.println('2'+'2');
		 System.out.println('2'+2);
		 System.out.println(200+300+""+200);
		 System.out.println(""+200+300+200);
		 double z=t1*g*g*0.5;
		 z=Math.round(10*z)/10.0;//去精度
		 System.out.println(t1+"秒后，物体下落了了"+z+"米");
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("请输入你的贷款本金：（万）");
		  double p = scanner.nextDouble() * 10000;
		  System.out.println("请输入你的贷款年利率：（%）");
		 double r = scanner.nextDouble() / 1200;
		  System.out.println("请输入你的还款年数：");
		 int m = scanner.nextInt() * 12;
		  double payment = (p * r * Math.pow((1 + r), m))
				  /(Math.pow(1 + r, m) - 1);
		  payment = Math.round(payment * 100) / 100.0;
		  System.out.println("你的每月还款金额为：￥" + payment);

		

	}

}
