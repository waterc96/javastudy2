package day_3and4_xunhuan;

import java.util.Scanner;

public class Switch_1 {
	static char answer;
	 static int jijie;
	
	public static void main(String[] args) {
		answer='c';
		xuanze();
		System.out.println("������1-12�µ�ĳ���¼��㼾��");
		Scanner sc=new Scanner(System.in);
		jijie=sc.nextInt();
		jijie();
	}
	public static void jijie() {
		//case��͸����û��break
		switch(jijie) {
		case 3:
		case 4:
		case 5:
			System.out.println("���꾪�������  ");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����â��������");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�ﴦ¶�ﺮ˪��");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("��ѩѩ��С��");
			break;
		default :
			break;
		}
	}
	public static void xuanze() {
		switch(answer){
		case'A'|'a':
			System.out.println("����ѡA");
			break;
		case'B'|'b':
			System.out.println("����ѡB");
			break;
		case'C'|'c':
			System.out.println("����ѡC");
			break;
		case'D'|'d':
			System.out.println("����ѡD");
			break;
		default:
			System.out.println("�ٲ�Ҫ��ѡ��");
		}
	}
}
