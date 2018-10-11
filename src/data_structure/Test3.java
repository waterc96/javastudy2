package data_structure;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
//			if(o1%2==o2%2) {
//				if(o1%2==0) {
//					return o2-o1;
//				}else
//				return o1-o2;
//			}
//				return o2%2-o1%2;
				return(o1%2==o2%2?(o1%2==0? o2-o1:
					 o1-o2): o2%2-o1%2);
				}
			
		});
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(9);
		ts.add(0);
		for(Integer i:ts) {
			System.out.print(i+" ");
		}
	}

}
