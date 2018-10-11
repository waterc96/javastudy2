package day_6_shuzu;


import java.util.*;
import java.util.Scanner;

public class zuoye3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[]arr=new int[10];
		int i1=0;
		do{
		System.out.println("请输入第"+(i1+1)+"评委的分数");
		Scanner sc=new Scanner(System.in);
		arr[i1]=sc.nextInt();
		i1++;
		}while(i1<10);
		int max=arr[0];
		int min=arr[1];
		for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
				if(arr[i]<min) {
					min=arr[i];
				}
			}
		System.out.println(Arrays.toString(arr)+min+" "+max+" ");
		//简单一点的是找出最大值最小值后在算平均数的时候减掉即可；
		//删除一个最大值(直接取出一个最大值为0,最小值同理)
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]==max) {
				arr[j]=0;
				//arr=Arrays.copyOf(arr,arr.length-1);
				break;
			}
		}
		System.out.println(Arrays.toString(arr)+"删除一个最大值");
		//删除一个最小值
		for (int j1 = 0; j1 < arr.length; j1++) {
			if(arr[j1]==min) {
				arr[j1]=0;
				//arr=Arrays.copyOf(arr,arr.length-1);
				break;
			}
		}
		System.out.println(Arrays.toString(arr)+"删除一个最小值");
		//到这一步完成题目要求，接下来取出数组中的所有数字求平均数
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double score=sum/i1;
		System.out.println("这名选手的最终得分是："+score);
		}

	}
