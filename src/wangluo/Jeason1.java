/**
 * json �е��������Լ�ֵ�Ե���ʽ���ڵģ�keyֵֻ����String���ͣ�value����his�������͡�
 * Gson  jackson fastjson���Ƕ�json���в��������ֿ⡣
 * {"����":"����"}
 * {"�ɼ�":{"����":120��"��ѧ":114,"����":{"��ѧ":20,"����":60}}}
 * 
 * 
 * 
 * json������
 * 
 */
package wangluo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
/**
 * @author daixuan
 *
 * 2018��9��3��
 */
public class Jeason1 {

 public static void main(String[] args) throws JSONException {
	 JSONObject jo =new JSONObject();
	 jo.put("NAME", "����");
	// System.out.println(jo.toString());
	 JSONArray phonenum=new JSONArray();
	 phonenum.put(133);
	 phonenum.put(132);
	 jo.put("�绰", phonenum);
	System.out.println(jo.toString());
// JSONArray students=new JSONArray();
	 JSONStringer jso=new JSONStringer();
	 jso.object();
	 jso.key("pingpai");
	 jso.value("apple");
	 jso.key("shouji");
	 jso.object();
	 jso.key("x");

	 jso.value(8848);
	 jso.key("xs");
	 jso.object();
	 jso.key("di");
	 jso.value(6848);
	 jso.key("zhong");
	 
	 jso.value(7848);
	 jso.endObject();
	 jso.endObject();
	 jso.key("num");
	 jso.array();
	 jso.value("123213").value("1234212");
	 jso.endArray();
	 jso.endObject();
	 System.out.println(jso.toString());
	 
	 Gson gson=new Gson();
	 
	// Student s =gson.fromJson(jso, Student.class);
	 
	 
}
}
class Student{
	String name;
	int age;
	boolean sex;

	public Student(String name,int age,boolean sex) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.age=age;
	this.sex=sex;
	
	}
	
}