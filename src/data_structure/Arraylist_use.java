package data_structure;
/*ArrayList��Vector�ײ�����ݽṹ�������飬���ԸĲ�죬��ɾ��
 * LinkList��ɾ�飬���Ĳ���
 * 
 * */
import java.util.*;
//����Ƕ��
//��һ��ѧУ���༶��ѧ��
public class Arraylist_use {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List<ArrayList> school=new ArrayList<>(); 
		List<ArrayList> clazz=new ArrayList<>(); 
		List<ArrayList> clazz1=new ArrayList<>(); 
		List<Student1> student=new ArrayList<>();
		List<Student1> student1=new ArrayList<>();
		
		
		student.add(new Student1("���",12));
		student.add(new Student1("������",18));
		System.out.println(student.toString());
		clazz.add((ArrayList) student);
		student1.add(new Student1("��gou",12));
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