package day_3and4_xunhuan;
//��Ǯ��ټ�������5�飬ĸ��3�飬С��3��Ǯһֻ
public class Buyhen {
	public static void main(String[] args) {
		System.out.println("��Ǯ�ټ�����");
		// TODO �Զ����ɵķ������
		for(int gong=0;gong<=20;gong++) {
			for(int hen=0;hen<33;hen++) {
				int xiao;
				xiao=100-gong-hen;
				int cost;
				if(xiao%3==0) {
					cost=5*gong+hen*3+xiao/3;
					if(cost==100) {
						System.out.println("����������Ϊ"+gong+"ĸ��������Ϊ"+hen
								+"С��������Ϊ"+xiao);
					}
				}
				
			}
		}

	}

}
