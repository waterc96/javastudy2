package day_3and4_xunhuan;

import java.util.Scanner;

public class if_2 {
	public static void main(String[] args) {
		System.out.println("请输入第一个数字");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("请输入第二个数字");
		int b=sc.nextInt();
		System.out.println("请输入第三个数字");
		int c=sc.nextInt();
		if_2 cc=new if_2();
		cc.bijiao(a, b, c);

	}
	public  void bijiao(int a,int b, int c) {
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else  {
			if(b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
		
	}
}
