/**
 * 
 */
package xml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @author daixuan
 *
 * 2018��9��6��
 */
public class xml_caozuo2 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SAXReader reader=new SAXReader();
		Document document=reader.read("G:\\javaee\\new_javajc\\src\\xml\\NewFile.xml");
		Element root=document.getRootElement();
		//һ�����ҵ���Ҫ�������ӽڵ�
		Element telephone=root.element("contact").element("telephone");
		telephone.setText("110");
		root.element("contact").remove(root.element("contact").element("qq"));
		root.element("contact").addElement("qq��").setText("872544205");
		
		
		
		//�Խڵ�����ͬ�����Բ�ͬ�Ľڵ���в���
		List <Element>list=root.elements();
		for(Element e:list) {
			if(e.attributeValue("id").equals("002")) {
				//���в���
				e.remove(e.element("qq"));
				e.addElement("siji");
				e.element("siji").setText("500");
			}
		}
		
		
		
		//���������ʽ
		OutputFormat of=OutputFormat.createPrettyPrint();
		//���ñ����ʽ
		of.setEncoding("UTF-8");
		//�������·��
		XMLWriter writer=new XMLWriter(new FileOutputStream(new File("G:\\\\javaee\\\\new_javajc\\\\src\\\\xml\\\\NewFile.xml")),of);
		writer.write(document);
	}

}
