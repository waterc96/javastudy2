package day_6_shuzu;

import java.util.Arrays;

public class Maopao {
/*
 * ð������:ð�������ǰ����ڵ��������ֽ��бȽϣ�Ȼ���ٺ���һ���Ƚϣ���󽫴�������ŵ�����棬
 * ��ʣ�µ������ظ�������衣
 * */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
