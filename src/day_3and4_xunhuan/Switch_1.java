package day_3and4_xunhuan;

import java.util.Scanner;

public class Switch_1 {
	static char answer;
	 static int jijie;
	
	public static void main(String[] args) {
		answer='c';
		xuanze();
		System.out.println("请输入1-12月的某个月计算季节");
		Scanner sc=new Scanner(System.in);
		jijie=sc.nextInt();
		jijie();
	}
	public static void jijie() {
		//case穿透，即没有break
		switch(jijie) {
		case 3:
		case 4:
		case 5:
			System.out.println("春雨惊春清谷天  ");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏满芒夏暑相连");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋处露秋寒霜降");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬雪雪冬小大寒");
			break;
		default :
			break;
		}
	}
	public static void xuanze() {
		switch(answer){
		case'A'|'a':
			System.out.println("这题选A");
			break;
		case'B'|'b':
			System.out.println("这题选B");
			break;
		case'C'|'c':
			System.out.println("这题选C");
			break;
		case'D'|'d':
			System.out.println("这题选D");
			break;
		default:
			System.out.println("再不要胡选了");
		}
	}
}
