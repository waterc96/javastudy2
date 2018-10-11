/**
 * 
 */
package xml;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author daixuan
 *使用dom解析处理xml文件 
 *读取整个xml文件进内存当中
 * 增删改查
 * 2018年9月5日
 */
public class xmlDom_1 {
	public static void main(String[] args) throws Exception {
		//获取解析器工厂对象
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		//获取解析器对象
		DocumentBuilder bulider=dbf.newDocumentBuilder();
		//解析xml文件的内容
		Document document=bulider.parse("xml.xml");
		//获取到根节点
		Element root=document.getDocumentElement();
		System.out.println(root.getTagName());
		//遍历子节点
		NodeList childnodes	=root.getChildNodes();
		for (int i = 0; i < childnodes.getLength(); i++) {
			Node item=childnodes.item(i);
			switch(item.getNodeType()) {
			case Node.ELEMENT_NODE:{
				System.out.println("获取元素名称"+item.getNodeName());
				System.out.println("获取节点内容"+item.getNodeValue());
				break;
			}
			case Node.COMMENT_NODE:{
				System.out.println("获取注释名称"+item.getNodeName());
				System.out.println("获取节点内容"+item.getNodeValue());
				break;
			}

			case Node.CDATA_SECTION_NODE:{
				System.out.println("获取cdata名称"+item.getNodeName());
				System.out.println("获取节点内容"+item.getNodeValue());
				break;
			}
			case Node.TEXT_NODE:{
				System.out.println("获取文本节点名称"+item.getNodeName());
				System.out.println("获取节点内容"+item.getNodeValue());
				break;
			}
			
			}
			
		}
		//增加节点
		Element student=document.createElement("student");
		student.setAttribute("id","3");
		Element name=document.createElement("name");
		name.setTextContent("wang");
		Element age=document.createElement("age");
		name.setTextContent("13");
		student.appendChild(name);
		student.appendChild(name);
		root.appendChild(student);
		
		//修改节点
		Node xname=document.getElementsByTagName("name").item(0);
		xname.setTextContent("tom");
		domTrasformXml(document);
		//调用转换函数
		//删除一个节点
		Node s=document.getElementsByTagName("student").item(0);
		root.removeChild(s);
//		document.removeChild(s);
		domTrasformXml(document);
		//增加属性
		root.setAttribute("id", "0");
		root.setAttribute("total", "100");
		domTrasformXml(document);
		//获取属性
		String total = root.getAttribute("total");
		System.out.println(total);
		//移除属性
		root.removeAttribute("id");
		domTrasformXml(document);
		
		
		
		
		
	}
	private static void domTrasformXml(Document document) throws Exception{
		// 转换dom对象为xml文件
		// 获取转换器工厂对象
		TransformerFactory taFactory = TransformerFactory.newInstance();
		// 获取转换器对象
		Transformer transformer = taFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("src/student.xml"));

	}
}
