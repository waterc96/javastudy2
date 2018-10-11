package day_3and4_xunhuan;

import java.util.Scanner;

public class zuoye5 {

	/**
	 * 第五天作业，全部整合在这一个类了，老师辛苦了
	 * @param args
	 */
	public static void main(String[] args) {
		//公式是:最小值---最大值（整数）的随机数 类型）最小值+Math.random()*最大值
		//Math.random()只能生成[0.0--1.0)之间的double数
		//第一题加强版（用户输入位数，程序找出满足题中条件的数字,输入太多了会太慢，建议5.6位就行）
		//duichengshu();
		//第二题1--1000
		//ti2();
		//System.out.println("-------------------");
		//第三题珠穆朗玛峰
		//zhumulang();
		//System.out.println("-------------------");
		//第四题5的阶乘
		//jiecheng5();
		//System.out.println("-------------------");
		//第五题水仙花数
		//waterflower();
		//System.out.println("-------------------");
		//第6题99乘法表正反
		//zheng(); 
		//fan();
		//System.out.println("-------------------");
		//第七题猜数字小游戏
		//caigame();
		//System.out.println("-------------------");
		//第八题 1-100除了7和7的倍数
		//dayin77();
		

	}
	private static void duichengshu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入位数(最大输入7位数)");
		int w=sc.nextInt();
		//zuoye1();
		
		int []a=new int[w];
		int i;
		for(i=(int) Math.pow(10, w-1);i<Math.pow(10, w);i++){
			for(int j=2;j<w;j++) {
			 a[j-1]=(int) ((i%Math.pow(10, (j)))/Math.pow(10, j-1));
				
			}
			a[0]=i%10;
			a[w-1]=(int) (i/Math.pow(10, w-1));
			
		if(a[4]==a[0]&&a[1]==a[3]&&a[2]==a[1]+a[3]+a[4]+a[0]){
		System.out.println(i);
		}
		}
	}
	private static void jiecheng5() {
		int sum=1;
		for(int i=5;i>0;i--) {
			sum*=i;
		}
		System.out.println(sum);
	}
	private static void waterflower() {
		// TODO 自动生成的方法存根
		for(int i=100;i<1000;i++) {
			int ge; 
			 int shi;
			 int bai;
			bai=i/100;
			 shi=(i-bai*100)/10;
			 ge=i%10;
			 if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge) {
				 System.out.println(i+" ");
			 }
			 
		}
	}
	private static void fan() {
		for(int i=9;i>0;i--){
			for(int j=i;j>0;j--) {
				int sum=i*j;
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

	private static void zheng() {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i*j+"  ");
			}
			System.out.println();
		}
	}

	private static void dayin77() {
		for(int i=1;i<=100;i++) {
			if(!(i%7==0)) {
				if(!(i/10==7)&&!(i%10==7))
				System.out.println(i+" ");
			}
		}
	}

	private static void zhumulang() {
		int i=0;
		double h=0;
		double paper=0.00008;
		while(h<=8848.13) {
			paper=2*paper;
			h=paper;	
			i++;
		}
		System.out.println(i);
	}

	private static void caigame() {
		int s=(int)(1+Math.random()*100);
		System.out.println(s);
		System.out.println("请输入一个数字（1--100）");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		boolean isok=false;
		int i=5;
		while(!isok) {
			if(i!=0) {
		if(y>s){ 
			i--;
			System.out.println("猜大了，请重新输入");
			System.out.println("剩余"+i+"");
			y=sc.nextInt();
		}else if(y<s) {
			i--;
			System.out.println("猜小了，请重新输入");
			System.out.println("剩余"+i+"");
			y=sc.nextInt();
		}else{
			System.out.print("猜对了！");
			isok=true;
		}
		}else {
			System.out.println("gg");
			break;
		}
		}
		//System.out.println(("用了"+i++)+"次");
	}

	private static void ti2() {
		for(int i=1;i<=1000;i++){
			if(i%3==2&&i%5==3&&i%7==2){
			System.out.println(i+" ");
			}
			}
	}

}
