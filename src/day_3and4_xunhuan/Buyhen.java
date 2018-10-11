package day_3and4_xunhuan;
//百钱买百鸡，公鸡5块，母鸡3块，小鸡3块钱一只
public class Buyhen {
	public static void main(String[] args) {
		System.out.println("百钱百鸡问题");
		// TODO 自动生成的方法存根
		for(int gong=0;gong<=20;gong++) {
			for(int hen=0;hen<33;hen++) {
				int xiao;
				xiao=100-gong-hen;
				int cost;
				if(xiao%3==0) {
					cost=5*gong+hen*3+xiao/3;
					if(cost==100) {
						System.out.println("公鸡的数量为"+gong+"母鸡的数量为"+hen
								+"小鸡的数量为"+xiao);
					}
				}
				
			}
		}

	}

}
