package data_structure;
import java.util.*;
public class Use4 {
	//.��д���򣬻�ȡ�����в����е��ַ����б���������ظ����ַ������ظ����ַ��Լ������ظ��Ժ���ַ��б�
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 String str = "abcdeafblmbnopaw21c";
		    //System.out.println("ԭ�ַ�����"+str);
		Collection<String> cc=new ArrayList<>();
		 Set<Character> set1 = new HashSet<Character>();//�����ظ�����ַ�
		 Set<Character> set2 = new HashSet<Character>();//�ظ����ַ�
		 Set<Character> set3 = new HashSet<Character>();//���ظ����ַ�
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

