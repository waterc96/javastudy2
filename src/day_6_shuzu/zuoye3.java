package day_6_shuzu;


import java.util.*;
import java.util.Scanner;

public class zuoye3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[]arr=new int[10];
		int i1=0;
		do{
		System.out.println("�������"+(i1+1)+"��ί�ķ���");
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
		//��һ������ҳ����ֵ��Сֵ������ƽ������ʱ��������ɣ�
		//ɾ��һ�����ֵ(ֱ��ȡ��һ�����ֵΪ0,��Сֵͬ��)
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]==max) {
				arr[j]=0;
				//arr=Arrays.copyOf(arr,arr.length-1);
				break;
			}
		}
		System.out.println(Arrays.toString(arr)+"ɾ��һ�����ֵ");
		//ɾ��һ����Сֵ
		for (int j1 = 0; j1 < arr.length; j1++) {
			if(arr[j1]==min) {
				arr[j1]=0;
				//arr=Arrays.copyOf(arr,arr.length-1);
				break;
			}
		}
		System.out.println(Arrays.toString(arr)+"ɾ��һ����Сֵ");
		//����һ�������ĿҪ�󣬽�����ȡ�������е�����������ƽ����
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double score=sum/i1;
		System.out.println("����ѡ�ֵ����յ÷��ǣ�"+score);
		}

	}
