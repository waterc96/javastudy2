package day_3and4_xunhuan;

public class For_1 {
	public static void main(String[] args) {
		//输出1-10
//		for(i=1;i<=10;i++) {
//			System.out.println(i+"  ");
//		}
		/* 输出10-1
		for(i=10;i>0;i--) {
			System.out.println(i+"  ");
		}
		*/
		//1到10的和
		int a=0;
		for(int j=1;j<=10;j++) {
			 a+=j;
		}
		System.out.println(a);
		
	//1到100偶数的和     奇数同理if（i%2!=0）
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
	//学生成绩等级查询
	//String str="";
	//str=JOptionPane.showInputDialog("请输入学生成绩（输入exit退出）：");  
	
	//if(str>90&&str<=100) {
		
	//}
	
	}
}
