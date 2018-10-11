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
 *ʹ��dom��������xml�ļ� 
 *��ȡ����xml�ļ����ڴ浱��
 * ��ɾ�Ĳ�
 * 2018��9��5��
 */
public class xmlDom_1 {
	public static void main(String[] args) throws Exception {
		//��ȡ��������������
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		//��ȡ����������
		DocumentBuilder bulider=dbf.newDocumentBuilder();
		//����xml�ļ�������
		Document document=bulider.parse("xml.xml");
		//��ȡ�����ڵ�
		Element root=document.getDocumentElement();
		System.out.println(root.getTagName());
		//�����ӽڵ�
		NodeList childnodes	=root.getChildNodes();
		for (int i = 0; i < childnodes.getLength(); i++) {
			Node item=childnodes.item(i);
			switch(item.getNodeType()) {
			case Node.ELEMENT_NODE:{
				System.out.println("��ȡԪ������"+item.getNodeName());
				System.out.println("��ȡ�ڵ�����"+item.getNodeValue());
				break;
			}
			case Node.COMMENT_NODE:{
				System.out.println("��ȡע������"+item.getNodeName());
				System.out.println("��ȡ�ڵ�����"+item.getNodeValue());
				break;
			}

			case Node.CDATA_SECTION_NODE:{
				System.out.println("��ȡcdata����"+item.getNodeName());
				System.out.println("��ȡ�ڵ�����"+item.getNodeValue());
				break;
			}
			case Node.TEXT_NODE:{
				System.out.println("��ȡ�ı��ڵ�����"+item.getNodeName());
				System.out.println("��ȡ�ڵ�����"+item.getNodeValue());
				break;
			}
			
			}
			
		}
		//���ӽڵ�
		Element student=document.createElement("student");
		student.setAttribute("id","3");
		Element name=document.createElement("name");
		name.setTextContent("wang");
		Element age=document.createElement("age");
		name.setTextContent("13");
		student.appendChild(name);
		student.appendChild(name);
		root.appendChild(student);
		
		//�޸Ľڵ�
		Node xname=document.getElementsByTagName("name").item(0);
		xname.setTextContent("tom");
		domTrasformXml(document);
		//����ת������
		//ɾ��һ���ڵ�
		Node s=document.getElementsByTagName("student").item(0);
		root.removeChild(s);
//		document.removeChild(s);
		domTrasformXml(document);
		//��������
		root.setAttribute("id", "0");
		root.setAttribute("total", "100");
		domTrasformXml(document);
		//��ȡ����
		String total = root.getAttribute("total");
		System.out.println(total);
		//�Ƴ�����
		root.removeAttribute("id");
		domTrasformXml(document);
		
		
		
		
		
	}
	private static void domTrasformXml(Document document) throws Exception{
		// ת��dom����Ϊxml�ļ�
		// ��ȡת������������
		TransformerFactory taFactory = TransformerFactory.newInstance();
		// ��ȡת��������
		Transformer transformer = taFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("src/student.xml"));

	}
}
