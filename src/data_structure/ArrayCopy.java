/**
 * 
 */
package data_structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**ArrayList��copy
 * @author daixuan
 * 2018��9��26��
 */
public class ArrayCopy {
	static ArrayList A2=new ArrayList();
	//��clone
	static ArrayList A1=(ArrayList) A2.clone();
	//�ù�����copy
	ArrayList A3=new ArrayList(A2);
public static void main(String[] args) {
	//ʹ��collection�ķ���
	Collections.copy(A2, A1);

}
	
	
}
