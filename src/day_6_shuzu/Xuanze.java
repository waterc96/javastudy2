package day_6_shuzu;

import java.util.Arrays;

public class Xuanze {
	/*
	 * 初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列；
	 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
	 * */
	//选择排序
	    public static void main(String[] args) {
	        int[] arr={1,3,2,45,65,33,12};
	        System.out.println("交换之前："+Arrays.toString(arr));	             
	        //选择排序的优化
	        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
	            int k = i;
	            for(int j = k + 1; j < arr.length; j++){// 选最小的记录
	                if(arr[j] < arr[k]){ 
	                    k = j; //记下目前找到的最小值所在的位置
	                }
	            }
	            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
	            if(i != k){  //交换a[i]和a[k]
	                int temp = arr[i];
	                arr[i] = arr[k];
	                arr[k] = temp;
	            }    
	        }
	        System.out.println("交换之后："+Arrays.toString(arr));
	    }

	

}
