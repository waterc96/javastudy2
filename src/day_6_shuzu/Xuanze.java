package day_6_shuzu;

import java.util.Arrays;

public class Xuanze {
	/*
	 * ��ʼʱ���������ҵ���С����Ԫ�أ��ŵ����е���ʼλ����Ϊ���������У�
	 * Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ��ŵ����������е�ĩβ���Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
	 * */
	//ѡ������
	    public static void main(String[] args) {
	        int[] arr={1,3,2,45,65,33,12};
	        System.out.println("����֮ǰ��"+Arrays.toString(arr));	             
	        //ѡ��������Ż�
	        for(int i = 0; i < arr.length - 1; i++) {// ����i������
	            int k = i;
	            for(int j = k + 1; j < arr.length; j++){// ѡ��С�ļ�¼
	                if(arr[j] < arr[k]){ 
	                    k = j; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
	                }
	            }
	            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
	            if(i != k){  //����a[i]��a[k]
	                int temp = arr[i];
	                arr[i] = arr[k];
	                arr[k] = temp;
	            }    
	        }
	        System.out.println("����֮��"+Arrays.toString(arr));
	    }

	

}
