/**
 * 
 */
package xml;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.SAXParser;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * @author daixuan
 *ʹ��dom4j������ʼxml�ļ�
 * 2018��9��5��
 */
public class xml_dom4j {
	public static void main(String[] args) {

		//����һ��������
		SAXReader Reader=new SAXReader();
		
		try {
			//��ȡxml�ĵ���������Document����
			Document document=Reader.read(new File("G:\\javaee\\new_javajc\\src\\xml\\NewFile.xml"));
			//System.out.println(document);
			Element ele =document.getRootElement();
			parserNode(ele);
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void parserNode(Element ele){
		
		System.out.println(ele.getName()+":"+ele.getText().trim());
		//��Users���ڵ㿪ʼ������������=ֵ������ʽ��Ϊһ��Attribute����洢��List������
		List<Attribute> attrList = ele.attributes();
		for(Attribute attr : attrList){
			//ÿѭ��һ�Σ������˽ڵ��һ��������=ֵ����û���������
			String name = attr.getName();
			String value = attr.getValue();
			System.out.println(name+"="+value);
		}
		
		List<Element> eleList = ele.elements();
		//�ݹ�������ڵ��µ������ӽڵ�
		for(Element e : eleList){
			parserNode(e);
		}
	}
	
}
