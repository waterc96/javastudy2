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

/**假设需要把一个班级的各个宿舍信息发送出去，那么使用xml文件把这个信息描述出来
	3.1 班里一个9个学生
	3.2 男生6个人 女生3个
	3.3 每个宿舍住3个人
	3.4 男生宿舍从A301~A302
	3.5 女生宿舍B202
 * @author daixuan
 * 用java写xml文件(dom4j)
 * 2018年9月5日
 */
public class xml_zuoye {
	
	static Document document=DocumentHelper.createDocument();
	static Element root=document.addElement("student");
	static Element man=root.addElement("man");
	static Element woman=root.addElement("woman");
	
	
	public static void main(String[] args) throws Exception {
	jia("玳萱1", "18", "100", "A301");
	jia("玳萱2", "18", "200", "A301");
	jia("玳萱3", "18", "300", "A301");
	wjia("虎虎1","19","10","B301");
	wjia("虎虎2","19","10","B302");
	wjia("虎虎3","19","10","B303");	
	
	//定义输出格式
	OutputFormat of=OutputFormat.createPrettyPrint();
	//设置编码格式
	of.setEncoding("UTF-8");
	//设置输出路径
	XMLWriter writer=new XMLWriter(new FileOutputStream(new File("G:\\note\\xmlday01\\student.xml")),of);
	writer.write(document);
	}
	/**
	 * 
	 * @param 姓名
	 * @param 年龄
	 * @param 成绩
	 * @param 宿舍号
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




	