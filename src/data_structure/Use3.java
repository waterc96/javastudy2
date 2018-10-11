package data_structure;

import java.util.ArrayList;
import java.util.*;



public class Use3 {

	public static void main(String[] args) {
		//collection是所有集合类的超级接口。
		Collection cc=new ArrayList();
//		cc.add("Hello");
//		cc.add("Kitty");
//		cc.add("TIM");
//		System.out.println(cc);
//		Collection cc2=new ArrayList();
//		cc2.addAll(cc);
//		System.out.println(cc2);
//		cc.retainAll(cc2);
		//cc.clear();
		cc.add(2);
		cc.add(3);
		cc.add(4);
		cc.add(5);
		Iterator it=(Iterator) cc.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
	}

}
