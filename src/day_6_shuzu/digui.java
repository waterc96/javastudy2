/**
 * 
 */
package day_6_shuzu;

import java.util.Arrays;

/**
 * @author daixuan
 *
 * 2018Äê9ÔÂ2ÈÕ
 */
public class digui {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6};
		fanzhuan(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		System.out.println(jiecheng(4));
	}
	
	public static void fanzhuan(int[] a ,int left,int right) {
		if (left>= right)
	      return;
	    int temp = a[left];
	    a[left] = a[right];
	    a[right] = temp;
	    fanzhuan(a, ++left, --right);
	  }

	public static int jiecheng(int x) {
		if(x<0) {
			return 0;
		}else if(x==1) {
		return 1;}
		else {
			return x*jiecheng(x-1);
		}
	
	}

}
