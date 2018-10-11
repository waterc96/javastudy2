/**
 * 
 */
package xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author daixuan
 *��dom4j��xml  ��dom4jдxml
 * 2018��9��6��
 */
public class xml_read_dom4j {
	public static void main(String[] args) throws Exception {
		//SAXreader��һ���ܵ�����xml������
		SAXReader reader=new SAXReader();
		File file=new File("G:\\javaee\\new_javajc\\src\\xml\\NewFile.xml");
		Document document=reader.read(file);
		Element root=document.getRootElement();
		List<Element>childelments=root.elements();
		//�õ����ӽڵ�Ȼ��ȥ����,root.elements�õ��������ӽڵ㡣
		for(Element child:childelments) {
			 //δ֪�����������
	        /*List<Attribute> attributeList = child.attributes();
	        for (Attribute attr : attributeList) {
	            System.out.println(attr.getName() + ": " + attr.getValue());
	        }*/
	        //��֪�����������
	        System.out.println("id: " + child.attributeValue("id"));
	        //δ֪��Ԫ�����������
			List<Element> elementslist=child.elements();
			for(Element ele:elementslist) {
				System.out.println(ele.getName()+" "+ele.getText());
			}
			//��֪�ӽڵ����������
//			System.out.println("name"+child.elementText("name"));
//			System.out.println("telephone"+child.elementText("telephone"));
//			System.out.println("age"+child.elementText("age"));
//			System.out.println("emile"+child.elementText("emile"));
//			System.out.println("qq"+child.elementText("qq"));
		
			
		}
		
	}
	
	
	
	
}
