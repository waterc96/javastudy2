package day_3and4_xunhuan;

import java.util.Scanner;
	
public class If_1{
	public static void main(String[] args) {
		while(true) {
		System.out.println("������һ������x������Ϊ0��");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sgx(x);
		int y=10;
		jiou(y);
		}
	
	}
	public static void sgx(int x){
	if(x>0){
	System.out.println("x="+1);
	}else{
	if(x==0){
	System.out.println("x="+0);
	}else{
	System.out.println("x="+-1);
	}
	}
	}
	public static  void jiou (int y){
	if(y==0) {
		System.out.println("0�Ȳ�������Ҳ����ż��");
	}
	else if(y%2==0) {
		System.out.println("�������ż��");
	}else if(y%2!=0){
		System.out.println("�����������");
	}
	}
}
	 
	