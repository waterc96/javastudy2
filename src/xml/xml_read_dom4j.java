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
 *用dom4j读xml  用dom4j写xml
 * 2018年9月6日
 */
public class xml_read_dom4j {
	public static void main(String[] args) throws Exception {
		//SAXreader是一个管道来把xml读出来
		SAXReader reader=new SAXReader();
		File file=new File("G:\\javaee\\new_javajc\\src\\xml\\NewFile.xml");
		Document document=reader.read(file);
		Element root=document.getRootElement();
		List<Element>childelments=root.elements();
		//得到了子节点然后去遍历,root.elements得到了所有子节点。
		for(Element child:childelments) {
			 //未知属性名情况下
	        /*List<Attribute> attributeList = child.attributes();
	        for (Attribute attr : attributeList) {
	            System.out.println(attr.getName() + ": " + attr.getValue());
	        }*/
	        //已知属性名情况下
	        System.out.println("id: " + child.attributeValue("id"));
	        //未知子元素名的情况下
			List<Element> elementslist=child.elements();
			for(Element ele:elementslist) {
				System.out.println(ele.getName()+" "+ele.getText());
			}
			//已知子节点名的情况下
//			System.out.println("name"+child.elementText("name"));
//			System.out.println("telephone"+child.elementText("telephone"));
//			System.out.println("age"+child.elementText("age"));
//			System.out.println("emile"+child.elementText("emile"));
//			System.out.println("qq"+child.elementText("qq"));
		
			
		}
		
	}
	
	
	
	
}
