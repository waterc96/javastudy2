package day_6_shuzu;

import java.util.Arrays;

public class bianli_erwei {
public static void main(String[] args) {
	int[][]arr= {{123,2,4,5},{2,6,},{9,8}};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(Arrays.toString(arr));
}
}
