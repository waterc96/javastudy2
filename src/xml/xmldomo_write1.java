/**
 * 
 * xml的解析de工具类
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
 *用dm4j写xml
 * 2018年9月4日
 */
public class xmldomo_write1 {
	public static void main(String[] args) throws Exception {
	Document document=DocumentHelper.createDocument();
	Element root=document.addElement("root");
	root.addElement("student");
		
	
		
		
	//定义输出格式
			OutputFormat of=OutputFormat.createPrettyPrint();
			//设置编码格式
			of.setEncoding("UTF-8");
			//设置输出路径
			XMLWriter writer=new XMLWriter(new FileOutputStream(new File("G:\\\\javaee\\\\new_javajc\\\\src\\\\xml\\\\lalala.xml")),of);
			writer.write(document);
	}
}