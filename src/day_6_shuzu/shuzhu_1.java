package day_6_shuzu;

public class shuzhu_1 {
	
	public static void main(String[] args) {
		//arr����������10�����鳤��
		//1.��������
		int crr[]=new int[10];
		//2.�������鲢��ʼ������,
		//��̬��ʼ����ϵͳ�����ʼֵ��ָֻ�����鳤��
		//��̬��ʼ������ʼ��ʱָ��ÿ������Ԫ�صĳ�ʼֵ����ϵͳ��������
		int arr[]=new int[]{1,2,3};
		int brr[]= {213,234234};
		 int len=brr.length;
		//System.out.println(len);
		//3.��ʼ���Ѿ�����������
		crr=new int[] {0,1,2,3,4,5,6,7,8,9,};
		int a=crr[0];
		crr[0]=crr[1];
		crr[3]=a;
		System.out.println(crr[0]);
		System.out.println(a);
		System.out.println(crr[3]);
		//��������
		int drr[]={1,2,3,4,3,4};
		for(int i=0;i<drr.length;i++) {
			System.out.print(drr[i]+"  ");
		}
		System.out.println();
		//���鸴��
		System.arraycopy(crr, 2, drr, 0, 6);
		for(int j=0;j<drr.length;j++) {
			System.out.print(drr[j]);
		}
		//��������(ð������ѡ������)
		//int arr2[]= {1,25,5,76,22};
		//��ά���� �����λ������������Ϊ���飬ÿ������ĳ���Ϊ
		int[][] array=new int[3][4];
		int	arrer[][]= {{12,2,5},{6,89,5},{6,4},};
		for(int i=0;i<arrer.length;i++){
			for(int j=0;j<arrer[i].length;j++){
				System.out.print(arrer[i][j]+" ");  
			}
			}
		System.out.println();
		//�ҳ������е����ֵ����Сֵ
		int arrm[]={2,3,45,6,7,889,9};
		int max=arrm[0];
		int min=arrm[0];
		for(int i=0;i<arrm.length;i++){
		if(max<arrm[i]){
		max=arrm[i];
		}
		if(min>arrm[i]){
		min=arrm[i];
		}
		}
		System.out.println("���ֵ�ǣ�"+max+"��Сֵ�ǣ�"+min);
	}
}
