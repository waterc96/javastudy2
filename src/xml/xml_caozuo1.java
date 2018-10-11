/**
 * 
 */
package xml;

/**
 * @author daixuan
 *
 * 2018年9月6日
 */


import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class xml_caozuo1 {

    public static void main(String[] args) {
        parseXml();
    }
    
    public static String parseXml(){
    	//SAXReader 的read方法可以读取外部的xml文件，返回一个Document 对象
        String xmlResult = null;
        SAXReader reader=new SAXReader();
        
        try {
            Document document=reader.read(new File("G:\\javaee\\new_javajc\\src\\xml\\honglou.xml"));
            //Document，dom4j的一个文档对象，用于操作xml文档的结构，
            //可通过调用它的getRootElement()方法获取根元素Element对象
            //Element，元素对象，它的方法还是挺多的，是主要操作对象。方法如下：
            Element root=document.getRootElement();
            Element element=root.element("红楼梦");
            Attribute attr=element.attribute("id");
            element.remove(attr);
            element.addAttribute("作者", "wang");
            Element e=element.addElement("朝代");
            e.addText("清朝");
            
            element.addCDATA("红楼梦是中国四大名著之一");
            OutputFormat format = OutputFormat.createPrettyPrint();  
            format.setEncoding("UTF-8");  
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(new File("G:\\javaee\\new_javajc\\src\\xml\\honglou.xml")),format);
            xmlWriter.write(document);
            System.out.println("操作成功");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return xmlResult;
    }
}