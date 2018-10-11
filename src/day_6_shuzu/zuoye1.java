package day_6_shuzu;

import java.util.Arrays;

public class zuoye1 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]={1,7,9,11,13,15,17,19};
		int b[]={2,4,6,8,10};
		b=Arrays.copyOf(b, b.length+7);
		System.arraycopy(a, 0, b, 5, 7);
		System.out.println(Arrays.toString(b));
		for(int i=1;i<b.length;i++){
			for(int j=0;j<b.length-i;j++){
			if(b[j]>b[j+1]){
				int count;
				count=b[j+1];
				b[j+1]=b[j];
				b[j]=count;
			}
			}
			}
		System.out.println(Arrays.toString(b));
//		for(int i1=0;i1<b.length;i1++) {
//			System.out.print(b[i1]+" ");
//		}
		System.out.println();
		System.out.println("=====================");
		int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,69,99}};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			 sum2+=arr[i][j];
		}
			// sum1+=sum2;
		 }
		System.out.println(sum2);


	}

}
