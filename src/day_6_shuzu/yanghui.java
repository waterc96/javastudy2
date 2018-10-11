package day_6_shuzu;

import java.util.Arrays;
import java.util.Scanner;


public class yanghui {
	public static void main(String[] args) {
			System.out.println("请输入想打印的行数");
			Scanner sc=new Scanner(System.in);
			//yanghui_1(sc);
			int r=sc.nextInt();
			int a[][]=new int[r][r];
			for(int i=0;i<r;i++) {
				a[i][0]=1;
				a[i][i]=1;
				for(int j=1;j<i;j++) {
					a[i][j]=a[i-1][j]+a[i-1][j-1];
				}
				}
			for(int i=0;i<r;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		
			
	
	
	
	
	}

	private static void yanghui_1(Scanner sc) {
		int r=sc.nextInt();
		int a[]=new int[r];
		for(int i=1;i<=r;i++) {
			int b[]=new int[i];
			b=Arrays.copyOf(a, a.length);
			a[0]=1;
			for(int j=1;j<b.length;j++) {
				a[j]=b[j-1]+b[j];
			}
			for(int p=0;p<a.length;p++) {
				if(!(a[p]==0)) {
					System.out.print(a[p]+" ");
				}
			}
		System.out.println();
		}
	}
}
