package data_structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Use_3 {
//Í¨¹ý¼¯ºÏ´æ´¢¶ÔÏó
	public static void main(String[] args) {
		List<Student> cc=new ArrayList<Student>();
	
		cc.add(new Student(18,"Ñî°¢»¢",90));
		cc.add(new Student(19,"ÑîÃû»¢",60));
		cc.add(new Student(20,"Ñî»¢»¢",80));
		
		//System.out.println(cc);
		for(Student s:cc) {
			System.out.println(s.toString());
		}
		System.out.println("-----------------");
		ListIterator<Student> i= cc.listIterator();
		while(i.hasNext()) {
			Student ss=i.next();
			System.out.println(ss);
		}
		while(i.hasPrevious()){
		Student ss=i.previous();
			System.out.println(ss);
		}
		
	}
}
class Student{
	private int age;
	private String name;
	private double score;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student() {}
	public Student(int age,String name,double score) {
		this.name=name;
		this.age=age;
		this.score=score;
	}
	public String toString() {
		return "name"+this.name
				+","+"age"+this.age
				+","+"score"+score;
		
	}
	
}