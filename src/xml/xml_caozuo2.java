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
 * 2018年9月6日
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
		//一步步找到需要操作的子节点
		Element telephone=root.element("contact").element("telephone");
		telephone.setText("110");
		root.element("contact").remove(root.element("contact").element("qq"));
		root.element("contact").addElement("qq号").setText("872544205");
		
		
		
		//对节点名相同，属性不同的节点进行操作
		List <Element>list=root.elements();
		for(Element e:list) {
			if(e.attributeValue("id").equals("002")) {
				//进行操作
				e.remove(e.element("qq"));
				e.addElement("siji");
				e.element("siji").setText("500");
			}
		}
		
		
		
		//定义输出格式
		OutputFormat of=OutputFormat.createPrettyPrint();
		//设置编码格式
		of.setEncoding("UTF-8");
		//设置输出路径
		XMLWriter writer=new XMLWriter(new FileOutputStream(new File("G:\\\\javaee\\\\new_javajc\\\\src\\\\xml\\\\NewFile.xml")),of);
		writer.write(document);
	}

}
