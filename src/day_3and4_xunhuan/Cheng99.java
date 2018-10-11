package day_3and4_xunhuan;

public class Cheng99 {

	public static void main(String[] args) {
		zheng();
		System.out.println("--------------------");
		//反的99乘法表
		fan();
		for(int i=0;i<6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
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

}
