/**
 * 
 */
package data_structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**ArrayList的copy
 * @author daixuan
 * 2018年9月26日
 */
public class ArrayCopy {
	static ArrayList A2=new ArrayList();
	//用clone
	static ArrayList A1=(ArrayList) A2.clone();
	//用构造器copy
	ArrayList A3=new ArrayList(A2);
public static void main(String[] args) {
	//使用collection的方法
	Collections.copy(A2, A1);

}
	
	
}
