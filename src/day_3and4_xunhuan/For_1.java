package day_3and4_xunhuan;

public class For_1 {
	public static void main(String[] args) {
		//���1-10
//		for(i=1;i<=10;i++) {
//			System.out.println(i+"  ");
//		}
		/* ���10-1
		for(i=10;i>0;i--) {
			System.out.println(i+"  ");
		}
		*/
		//1��10�ĺ�
		int a=0;
		for(int j=1;j<=10;j++) {
			 a+=j;
		}
		System.out.println(a);
		
	//1��100ż���ĺ�     ����ͬ��if��i%2!=0��
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum+=i;//sum=sum+i
				}
		}
		System.out.println(sum);
		
	int ji=1;
	for(int j=1;j<=10;j++) {
		ji*=j;
	}
	System.out.println(ji);
	//ѧ���ɼ��ȼ���ѯ
	//String str="";
	//str=JOptionPane.showInputDialog("������ѧ���ɼ�������exit�˳�����");  
	
	//if(str>90&&str<=100) {
		
	//}
	
	}
}
