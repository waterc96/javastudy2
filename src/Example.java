import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/**
 * @author daixuan
 *
 * 2018��8��28��
 */
//public class Kaoshi {
//	//List list = new ArrayList();
//public static void main(String args[]) {
//	List<String> list = new ArrayList<String>();
//	test2(list);
//	System.out.println(list.size()); // 1��
//	test3(list);
//	System.out.println(list.size()); // 2��
// }
//public static  void test2(List<String> list) {
//	list = null;
//	 }
//public static void test3(List<String> list) {
//	list.add("aaaa"); 
//	}
//}
public class Example {
	/*
	 * java��ֻ��ֵ����
	 * 1.�����������ʹ�ֵ�����βε��޸Ĳ���Ӱ��ʵ�Σ�
		2.�������ͣ������飩�����ã��βκ�ʵ��ָ��ͬһ���ڴ��ַ��ͬһ�����󣩣�
		���ԶԲ������޸Ļ�Ӱ�쵽ʵ�ʵĶ���
		3.String, Integer,Double��immutable���������⴦��
		�������Ϊ��ֵ�����Ĳ��������޸�ʵ�ζ���
	 * 
	 * */

String str = new String("good"); char[] ch = { 'a', 'b', 'c' };

public static void main(String[] args) {
	
	Example ex = new Example(); 
	Example.change(ex.str, ex.ch); 
	System.out.println(ex.str + "and");
	System.out.println(ex.ch);

}
public static void change(String str,char[] ch){ 
	str="test";
	ch[0]='g';
	
}
 
}
