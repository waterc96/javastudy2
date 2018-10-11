package day_3and4_xunhuan;

import java.util.Scanner;
	
public class If_1{
	public static void main(String[] args) {
		while(true) {
		System.out.println("请输入一个整数x（可以为0）");
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
		System.out.println("0既不是奇数也不是偶数");
	}
	else if(y%2==0) {
		System.out.println("这个数是偶数");
	}else if(y%2!=0){
		System.out.println("这个数是奇数");
	}
	}
}
	 
	