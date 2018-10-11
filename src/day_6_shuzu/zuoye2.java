package day_6_shuzu;

import java.util.Arrays;

public class zuoye2 {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,0,0,6,6,0,5,4,7,6,0,7,5};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=arr[arr.length -1];
				arr=Arrays.copyOf(arr,arr.length-1);
				for(int j=0;j<arr.length;j++) {
					if(arr[j]==0) {
						arr[j]=arr[arr.length -1];
						arr=Arrays.copyOf(arr,arr.length-1);
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int brr[]=Arrays.copyOf(arr,arr.length);
		System.out.println(Arrays.toString(brr));
	}

}
