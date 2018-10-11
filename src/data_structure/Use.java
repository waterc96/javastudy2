package data_structure;

import java.util.*;


public class Use {

	//Collection<String> t1=new ArrayList<>();
	
	public static void main(String[] args) {
		Collection<String> t1=new ArrayList<>();
		t1.add("jaa");
		t1.add("213jaa2");
		t1.add("hjaa3");
		t1.add("gjaa4");
		
		System.out.println(t1);
		Collection<String> t2=new HashSet<>();
		t2.addAll(t1);
		System.out.println(t2);
		Set<Integer> iset=new HashSet<Integer>();
		iset.add(Integer.valueOf(4));
		System.out.println(iset);
		
		
		

	}

}
