package day_2;
import java.util.*;
import java.math.*;

public class kuo_2 {

	public static void main(String[] args) {
		//���ݽ���1
		int a=10;
		int b=20;
//		int temp=a;
//		a=b;
//		b=temp;
	//	System.out.println(b+"            "+a);
		//���ݽ���2
		 a=a+b;
		 b=a-b;
		 a=(a+b)/2;
		 System.out.println(b+"            "+a);
		 Scanner t=new Scanner(System.in);
		 System.out.println("���������������ʱ��");
		 double t1=t.nextDouble();
		// double s1=(double)s;
		 double s;
		 double g=9.80;
		 
		 System.out.println('2'+'2');
		 System.out.println('2'+2);
		 System.out.println(200+300+""+200);
		 System.out.println(""+200+300+200);
		 double z=t1*g*g*0.5;
		 z=Math.round(10*z)/10.0;//ȥ����
		 System.out.println(t1+"���������������"+z+"��");
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("��������Ĵ���𣺣���");
		  double p = scanner.nextDouble() * 10000;
		  System.out.println("��������Ĵ��������ʣ���%��");
		 double r = scanner.nextDouble() / 1200;
		  System.out.println("��������Ļ���������");
		 int m = scanner.nextInt() * 12;
		  double payment = (p * r * Math.pow((1 + r), m))
				  /(Math.pow(1 + r, m) - 1);
		  payment = Math.round(payment * 100) / 100.0;
		  System.out.println("���ÿ�»�����Ϊ����" + payment);

		

	}

}
