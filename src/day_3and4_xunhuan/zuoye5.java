package day_3and4_xunhuan;

import java.util.Scanner;

public class zuoye5 {

	/**
	 * ��������ҵ��ȫ����������һ�����ˣ���ʦ������
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʽ��:��Сֵ---���ֵ��������������� ���ͣ���Сֵ+Math.random()*���ֵ
		//Math.random()ֻ������[0.0--1.0)֮���double��
		//��һ���ǿ�棨�û�����λ���������ҳ�������������������,����̫���˻�̫��������5.6λ���У�
		//duichengshu();
		//�ڶ���1--1000
		//ti2();
		//System.out.println("-------------------");
		//���������������
		//zhumulang();
		//System.out.println("-------------------");
		//������5�Ľ׳�
		//jiecheng5();
		//System.out.println("-------------------");
		//������ˮ�ɻ���
		//waterflower();
		//System.out.println("-------------------");
		//��6��99�˷�������
		//zheng(); 
		//fan();
		//System.out.println("-------------------");
		//�����������С��Ϸ
		//caigame();
		//System.out.println("-------------------");
		//�ڰ��� 1-100����7��7�ı���
		//dayin77();
		

	}
	private static void duichengshu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������λ��(�������7λ��)");
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
		// TODO �Զ����ɵķ������
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
		System.out.println("������һ�����֣�1--100��");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		boolean isok=false;
		int i=5;
		while(!isok) {
			if(i!=0) {
		if(y>s){ 
			i--;
			System.out.println("�´��ˣ�����������");
			System.out.println("ʣ��"+i+"");
			y=sc.nextInt();
		}else if(y<s) {
			i--;
			System.out.println("��С�ˣ�����������");
			System.out.println("ʣ��"+i+"");
			y=sc.nextInt();
		}else{
			System.out.print("�¶��ˣ�");
			isok=true;
		}
		}else {
			System.out.println("gg");
			break;
		}
		}
		//System.out.println(("����"+i++)+"��");
	}

	private static void ti2() {
		for(int i=1;i<=1000;i++){
			if(i%3==2&&i%5==3&&i%7==2){
			System.out.println(i+" ");
			}
			}
	}

}
