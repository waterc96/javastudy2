/**
 * 
 * xml�Ľ���de������
 */
package xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @author daixuan
 *��dm4jдxml
 * 2018��9��4��
 */
public class xmldomo_write1 {
	public static void main(String[] args) throws Exception {
	Document document=DocumentHelper.createDocument();
	Element root=document.addElement("root");
	root.addElement("student");
		
	
		
		
	//���������ʽ
			OutputFormat of=OutputFormat.createPrettyPrint();
			//���ñ����ʽ
			of.setEncoding("UTF-8");
			//�������·��
			XMLWriter writer=new XMLWriter(new FileOutputStream(new File("G:\\\\javaee\\\\new_javajc\\\\src\\\\xml\\\\lalala.xml")),of);
			writer.write(document);
	}
}