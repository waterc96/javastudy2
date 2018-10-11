package day_3and4_xunhuan;

import java.util.Scanner;

public class For_2 {
	
	
	public static void main(String[] args) {
		//有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？     
		//1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去   掉不满足条件的排列。  
		 dd();  
		 //打出所有的水仙花数
		//waterflower();
		//直角三角形
		//sanjiao();
		//猴子吃桃问题
		//monkey();
		duichengshu();
		}

	private static void duichengshu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入位数(最大输入10位数)");
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

	private static void dd() {
		int i1=0;  
		    int j1=0;  
		    int k=0;  
		    int t=0;  
		    for(i1=1;i1<=4;i1++)  
		        for(j1=1;j1<=4;j1++)  
		            for(k=1;k<=4;k++)  
		                if(i1!=j1 && j1!=k && i1!=k)  
		                {t+=1;  
		                    System.out.println(i1*100+j1*10+k);  
		 }    
		    System.out.println (t);
	}
	
	private static void monkey() {
		int x1=1;
		int sum = 0;
	for(int day=10;day>0;day--) {
			 sum=(x1+1)*2;
			x1=sum;
		  }
	System.out.println(sum);
	}
	private static void sanjiao() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
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

}
	
