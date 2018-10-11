package day_6_shuzu;

public class zuoye4 {
/*
 * 快速找到数组中的最大数和第二大的数
 * 如果当前元素大于最大数 max，则让第二大数等于原来的最大数 max，再把当前元素的值赋给 max。
 * 如果当前的元素大于等于第二大数secondMax的值而小于最大数max的值，则要把当前元素的值赋给 secondMax。
 * */
	public static void main(String[] args) {
		int arr[]={12,2,42,57,87,5,56,98};
		int i = 0;
		int max=arr[0];
		int second_max=arr[0];
		for( i=0;i<arr.length;i++){ 
	        if(arr[i] > max)  
	        {  
	            second_max = max;  
	            max = arr[i];  
	        }  
	        else  
	        {  
	            if(arr[i] > second_max)  
	                second_max = arr[i];  
	        }  
	        }
		System.out.println(max+"   "+second_max);
}
}