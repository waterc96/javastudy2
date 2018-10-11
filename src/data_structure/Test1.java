package data_structure;

import java.util.*;
//分别使用匿名内部类和静态内部类重写TreeSet中的compare
public class Test1 {
	static aa ys=new aa();
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>(ys);
		ts.add("HashSet");
		ts.add("ArrayList");
		ts.add("TreeMap");
		ts.add("HashMap");
		ts.add("TreeSet");
		ts.add("LinkedList");
		System.out.println(ts);
		
		
	}
	 static class aa implements Comparator<String>{
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
			
		};
	
	
	
	
//	
//	public static void main(String[] args) {
//		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareTo(s2);
////				return -s1.compareTo(s2);		
//			}
//		});
//		ts.add("HashSet");
//		ts.add("ArrayList");
//		ts.add("TreeMap");
//		ts.add("HashMap");
//		ts.add("TreeSet");
//		ts.add("LinkedList");
////		System.out.println(ts);
////		System.out.println(ts.descendingSet());
//		System.out.println(ts);
//	}
//
//
//
}
