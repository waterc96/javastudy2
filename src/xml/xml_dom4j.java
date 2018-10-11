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
 *使用dom4j解析开始xml文件
 * 2018年9月5日
 */
public class xml_dom4j {
	public static void main(String[] args) {

		//创建一个解析器
		SAXReader Reader=new SAXReader();
		
		try {
			//读取xml文档，并返回Document对象
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
		//从Users根节点开始遍历，像【属性=值】的形式存为一个Attribute对象存储在List集合中
		List<Attribute> attrList = ele.attributes();
		for(Attribute attr : attrList){
			//每循环一次，解析此节点的一个【属性=值】，没有则输出空
			String name = attr.getName();
			String value = attr.getValue();
			System.out.println(name+"="+value);
		}
		
		List<Element> eleList = ele.elements();
		//递归遍历父节点下的所有子节点
		for(Element e : eleList){
			parserNode(e);
		}
	}
	
}
