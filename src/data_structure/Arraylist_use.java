package data_structure;
/*ArrayList和Vector底层的数据结构都是数组，所以改查快，增删慢
 * LinkList增删块，做改查慢
 * 
 * */
import java.util.*;
//集合嵌套
//有一个学校，班级，学生
public class Arraylist_use {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<ArrayList> school=new ArrayList<>(); 
		List<ArrayList> clazz=new ArrayList<>(); 
		List<ArrayList> clazz1=new ArrayList<>(); 
		List<Student1> student=new ArrayList<>();
		List<Student1> student1=new ArrayList<>();
		
		
		student.add(new Student1("杨虎虎",12));
		student.add(new Student1("虎虎杨",18));
		System.out.println(student.toString());
		clazz.add((ArrayList) student);
		student1.add(new Student1("杨gou",12));
		student1.add(new Student1("asdh",18));
		clazz1.add((ArrayList) student1);
		school.add((ArrayList) clazz);
		school.add((ArrayList) clazz1);
		System.out.println(school.toString());
		
		
	}

	
}

class Student1{
	
	String name;
	int age;
	public Student1 (String name,int age) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student1 name=" + name + ", age=" + age;
	}
	
	
}