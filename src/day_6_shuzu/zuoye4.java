package day_6_shuzu;

public class zuoye4 {
/*
 * �����ҵ������е�������͵ڶ������
 * �����ǰԪ�ش�������� max�����õڶ���������ԭ��������� max���ٰѵ�ǰԪ�ص�ֵ���� max��
 * �����ǰ��Ԫ�ش��ڵ��ڵڶ�����secondMax��ֵ��С�������max��ֵ����Ҫ�ѵ�ǰԪ�ص�ֵ���� secondMax��
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