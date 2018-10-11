package day_6_shuzu;

import java.util.Arrays;

public class Maopao {
/*
 * 冒泡排序法:冒泡排序是把相邻的两个数字进行比较，然后再和下一个比较，最后将大的数字排到最后面，
 * 将剩下的数字重复这个步骤。
 * */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []arr1= {21,22,43,98,65,7,44,90};
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					int count;
					count=arr1[j+1];
					arr1[j+1]=arr1[j];
					arr1[j]=count;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		

	}

}
