package day_3and4_xunhuan;

public class Do_while1 {
			public static void main(String[] args) {
			//小明攒钱问题
			xiaoming();
				
			}
	private static void xiaoming() {
		double money=0;
		int day=0;
				do {
				day++;
				money=money+2.5;
				if(day%5==0){
				money=money-6;
				}
				}while(money<=100);
				
				System.out.println("小明在第"+day+"天终于攒够钱了");
	}
}

