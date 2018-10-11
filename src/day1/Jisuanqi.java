package day1;

import java.util.Scanner;

public class Jisuanqi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2=0;
		System.out.println("请输入第一个数");
		n1=sc.nextInt();
		System.out.println("请输入运算符号");
		String str=sc.next();
		char ch=str.charAt(0);
		
		//charAt返回 char指定索引处的值
		System.out.println("请输入第二个数");
		n2=sc.nextInt();
		switch(ch) {
		case'+':
			int sum=n1+n2;
			System.out.println("这两个数字的和是： "+sum);
			break;
		case'-':
			int jian=n1-n2;
			System.out.println("这两个数字相减的结果是： "+jian);
			break;
		case'*':
			int cheng=n1*n2;
			System.out.println("这两个数字的积是： "+cheng);
			break;
		case'/':
			if(n2==0) {
				System.out.println("被除数为零，运算无意义");
				break;}
				else {
			int chu=n1/n2;
			System.out.println("这两个数字相除的除的结果： "+chu);
			break;
		}
			default:
				System.out.println("运算符是无意义字符");
				break;
				
			}
		
		
		
	}

}
