package data_structure;
import java.util.*;
public class Use4 {
	//.编写程序，获取命令行参数中的字符串列表，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表。
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 String str = "abcdeafblmbnopaw21c";
		    //System.out.println("原字符串："+str);
		Collection<String> cc=new ArrayList<>();
		 Set<Character> set1 = new HashSet<Character>();//消除重复后的字符
		 Set<Character> set2 = new HashSet<Character>();//重复的字符
		 Set<Character> set3 = new HashSet<Character>();//不重复的字符
		cc.add(str);
		cc.add("sb");
		//System.out.println(cc.toString());
		char [] ca=str.toCharArray();
		for(char c :ca) {
			boolean b=set1.add(c);
			if(!b) {
				set2.add(c);
			}
		}
		set3.addAll(set1);
		set3.removeAll(set2);
		System.out.println(set1.toString());
		System.out.println(set2.toString());
//		System.out.println(set3.toString());
		for(Character s:set3) {
			System.out.print(s);
		}
//		((ArrayList)cc).remove(0);
//		for(String s:cc) {
//			System.out.println(s);
//		}
		
	}

}

