package day_3and4_xunhuan;

public class While_1 {
public static void main(String[] args) {
	helloworld();
	//1--100�ĺ�
	he100();
	//����͵��while�ⷨ
	int x1=1;
	int day=9;
	int sum=0;
	while(day>0) {
		sum=(x1+1)*2;
		x1=sum;
		day--;
	}
	System.out.println(sum);
}

private static void he100() {
	int a=1;
	int sum=0;
	while(a<=100) {
		sum+=a;
		a++;
	}
	System.out.println(sum);
}

private static void helloworld() {
	int i=1;
	String a="helloworld";
	while(i<=10) {
		System.out.println("���ǵ�"+i+"�δ�ӡ��"+a);
		i++;
	}
}
}
