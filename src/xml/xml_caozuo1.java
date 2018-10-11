/**
 * 
 */
package xml;

/**
 * @author daixuan
 *
 * 2018��9��6��
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
    	//SAXReader ��read�������Զ�ȡ�ⲿ��xml�ļ�������һ��Document ����
        String xmlResult = null;
        SAXReader reader=new SAXReader();
        
        try {
            Document document=reader.read(new File("G:\\javaee\\new_javajc\\src\\xml\\honglou.xml"));
            //Document��dom4j��һ���ĵ��������ڲ���xml�ĵ��Ľṹ��
            //��ͨ����������getRootElement()������ȡ��Ԫ��Element����
            //Element��Ԫ�ض������ķ�������ͦ��ģ�����Ҫ�������󡣷������£�
            Element root=document.getRootElement();
            Element element=root.element("��¥��");
            Attribute attr=element.attribute("id");
            element.remove(attr);
            element.addAttribute("����", "wang");
            Element e=element.addElement("����");
            e.addText("�峯");
            
            element.addCDATA("��¥�����й��Ĵ�����֮һ");
            OutputFormat format = OutputFormat.createPrettyPrint();  
            format.setEncoding("UTF-8");  
            XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(new File("G:\\javaee\\new_javajc\\src\\xml\\honglou.xml")),format);
            xmlWriter.write(document);
            System.out.println("�����ɹ�");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return xmlResult;
    }
}