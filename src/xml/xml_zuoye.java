/**
 * 
 */
package xml;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**������Ҫ��һ���༶�ĸ���������Ϣ���ͳ�ȥ����ôʹ��xml�ļ��������Ϣ��������
	3.1 ����һ��9��ѧ��
	3.2 ����6���� Ů��3��
	3.3 ÿ������ס3����
	3.4 ���������A301~A302
	3.5 Ů������B202
 * @author daixuan
 * ��javaдxml�ļ�(dom4j)
 * 2018��9��5��
 */
public class xml_zuoye {
	
	static Document document=DocumentHelper.createDocument();
	static Element root=document.addElement("student");
	static Element man=root.addElement("man");
	static Element woman=root.addElement("woman");
	
	
	public static void main(String[] args) throws Exception {
	jia("����1", "18", "100", "A301");
	jia("����2", "18", "200", "A301");
	jia("����3", "18", "300", "A301");
	wjia("����1","19","10","B301");
	wjia("����2","19","10","B302");
	wjia("����3","19","10","B303");	
	
	//���������ʽ
	OutputFormat of=OutputFormat.createPrettyPrint();
	//���ñ����ʽ
	of.setEncoding("UTF-8");
	//�������·��
	XMLWriter writer=new XMLWriter(new FileOutputStream(new File("G:\\note\\xmlday01\\student.xml")),of);
	writer.write(document);
	}
	/**
	 * 
	 * @param ����
	 * @param ����
	 * @param �ɼ�
	 * @param �����
	 * */
	public static void jia(String name,String age,String score,String sushe) {
		mstudent s=new mstudent(name,age,score,sushe);
		Element student=man.addElement("student");
		student.addAttribute("sushe", s.sushe);
		student.addElement("name").addText(s.name);
		student.addElement("age").addText(s.age);
		student.addElement("score").addText(s.score);
		
	}
	public static void wjia(String name,String age,String score,String sushe) {
		mstudent s=new mstudent(name,age,score,sushe);
		Element student=woman.addElement("student");
		student.addAttribute("sushe", s.sushe);
		student.addElement("name").addText(s.name);
		student.addElement("age").addText(s.age);
		student.addElement("score").addText(s.score);
		
	}
	
	
	
}
class mstudent{
	String name;
	String age;
	String score;
	String sushe;
	/**
	 * 
	 */
	public mstudent(String name,String age,String score,String sushe) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		this.score=score;
		this.sushe=sushe;
	}
	
	
	
}




	