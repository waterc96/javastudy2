package day_7_lei;

import java.util.Scanner;
/*
 * 1������¼�������������������Ӧ������
2������¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
3������¼���������ݣ������������еĽϴ�ֵ
4������¼���������ݣ��Ƚ��������Ƿ����
5������¼���������ݣ������������е����ֵ
6���Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�
����long���ͣ�����main�����н��в���
 * */
public class work1 {

	public static void main(String[] args) {
		//System.out.println("����������");
		//Scanner sc=new Scanner(System.in);
		//int row=sc.nextInt();
		//int col=sc.nextInt();
		//xingxing(row,col);
		//chengfabiao(sc);
		int c=bijiao(9,8);
		System.out.println(c);
		boolean d=is(8,8);
		System.out.println(d);
		int e=big(91,6,8);
		System.out.println(e);
	}
	private static void chengfabiao(Scanner sc) {
		int n=sc.nextInt();
		int ji=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				ji=i*j;
				System.out.print(ji+" ");	
			}
		System.out.println();
		}
	}
	public static void xingxing(int row,int col) {
		for(int i=0;i<row;i++) {
			for (int j =0; j<col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static int bijiao(int a,int b) {
		if(a>b) {
			return a;
		}else {
		return b;
	}
		}
	static boolean is(int a,int b) {
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}
	static int big(int a, int b,int c) {
		int max=0;
		if(a>b) {
			if(a>c) {
				 max=a;
			}else if(c>a) {
				 max=c;
			}
		}else if(b>a) {
			if(b>c) {
				max=b;
			}else if(c>b) {
				max=c;
			}
		}
	return max;
	}
	static boolean is(byte a,byte b) {
	if(a==b) {
		return true;
	}
	else {
		return false;
	}
	}
}
