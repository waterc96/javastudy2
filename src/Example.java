import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/**
 * @author daixuan
 *
 * 2018年8月28日
 */
//public class Kaoshi {
//	//List list = new ArrayList();
//public static void main(String args[]) {
//	List<String> list = new ArrayList<String>();
//	test2(list);
//	System.out.println(list.size()); // 1处
//	test3(list);
//	System.out.println(list.size()); // 2处
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
	 * java中只有值传递
	 * 1.基本数据类型传值，对形参的修改不会影响实参；
		2.引用类型（像数组）传引用，形参和实参指向同一个内存地址（同一个对象），
		所以对参数的修改会影响到实际的对象。
		3.String, Integer,Double等immutable的类型特殊处理，
		可以理解为传值，最后的操作不会修改实参对象。
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
