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
 * 2018年9月5日
 */
public class xml_jiexi1 {
public static void main(String[] args) {
	//创建一个解析器
	SAXReader Reader=new SAXReader();
	
	try {
		//读取xml文档，并返回Document对象
		org.dom4j.Document document=Reader.read(new File("G:\\javaee\\new_javajc\\src\\xml\\NewFile.xml"));
		System.out.println(document);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
}
}
