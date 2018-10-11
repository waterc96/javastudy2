package day_7_lei;

import java.util.Scanner;
/*
 * 1、键盘录入行数和列数，输出对应的星形
2、键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
3、键盘录入两个数据，返回两个数中的较大值
4、键盘录入两个数据，比较两个数是否相等
5、键盘录入三个数据，返回三个数中的最大值
6、比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，
两个long类型，并在main方法中进行测试
 * */
public class work1 {

	public static void main(String[] args) {
		//System.out.println("请依次输入");
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
