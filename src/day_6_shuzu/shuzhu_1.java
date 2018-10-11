package day_6_shuzu;

public class shuzhu_1 {
	
	public static void main(String[] args) {
		//arr是数组名，10是数组长度
		//1.申明数组
		int crr[]=new int[10];
		//2.声明数组并初始化数组,
		//动态初始化由系统分配初始值，只指定数组长度
		//静态初始化，初始化时指定每个数组元素的初始值，由系统决定长度
		int arr[]=new int[]{1,2,3};
		int brr[]= {213,234234};
		 int len=brr.length;
		//System.out.println(len);
		//3.初始化已经声明的数组
		crr=new int[] {0,1,2,3,4,5,6,7,8,9,};
		int a=crr[0];
		crr[0]=crr[1];
		crr[3]=a;
		System.out.println(crr[0]);
		System.out.println(a);
		System.out.println(crr[3]);
		//遍历数组
		int drr[]={1,2,3,4,3,4};
		for(int i=0;i<drr.length;i++) {
			System.out.print(drr[i]+"  ");
		}
		System.out.println();
		//数组复制
		System.arraycopy(crr, 2, drr, 0, 6);
		for(int j=0;j<drr.length;j++) {
			System.out.print(drr[j]);
		}
		//数组排序(冒泡排序，选择排序)
		//int arr2[]= {1,25,5,76,22};
		//二维数组 这个二位数组有三个以为数组，每个数组的长度为
		int[][] array=new int[3][4];
		int	arrer[][]= {{12,2,5},{6,89,5},{6,4},};
		for(int i=0;i<arrer.length;i++){
			for(int j=0;j<arrer[i].length;j++){
				System.out.print(arrer[i][j]+" ");  
			}
			}
		System.out.println();
		//找出数组中的最大值和最小值
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
		System.out.println("最大值是："+max+"最小值是："+min);
	}
}
