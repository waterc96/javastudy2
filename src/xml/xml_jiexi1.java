/**
 * 
 */
package xml;

import java.io.File;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;

/**
 * @author daixuan
 *
 * 2018��9��5��
 */
public class xml_jiexi1 {
public static void main(String[] args) {
	//����һ��������
	SAXReader Reader=new SAXReader();
	
	try {
		//��ȡxml�ĵ���������Document����
		org.dom4j.Document document=Reader.read(new File("G:\\javaee\\new_javajc\\src\\xml\\NewFile.xml"));
		System.out.println(document);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
}
}
