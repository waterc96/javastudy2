package day1;

import java.util.Scanner;

public class Jisuanqi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2=0;
		System.out.println("�������һ����");
		n1=sc.nextInt();
		System.out.println("�������������");
		String str=sc.next();
		char ch=str.charAt(0);
		
		//charAt���� charָ����������ֵ
		System.out.println("������ڶ�����");
		n2=sc.nextInt();
		switch(ch) {
		case'+':
			int sum=n1+n2;
			System.out.println("���������ֵĺ��ǣ� "+sum);
			break;
		case'-':
			int jian=n1-n2;
			System.out.println("��������������Ľ���ǣ� "+jian);
			break;
		case'*':
			int cheng=n1*n2;
			System.out.println("���������ֵĻ��ǣ� "+cheng);
			break;
		case'/':
			if(n2==0) {
				System.out.println("������Ϊ�㣬����������");
				break;}
				else {
			int chu=n1/n2;
			System.out.println("��������������ĳ��Ľ���� "+chu);
			break;
		}
			default:
				System.out.println("��������������ַ�");
				break;
				
			}
		
		
		
	}

}
