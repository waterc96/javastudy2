package day_7_lei;


public class Test {
	public static void main(String[] args) {
		Son a = new Son("����",18);//����������  ���䣺18
		a.setName("����");//���ı�ʾ����
		Father f = new Father();
		f.study("�鷨");//�ô���ִ�����Ϊ�� ����ѧϰ�鷨
		Father f2 = new Son("����",20);
		f2.study("�鷨");// �ô���ִ�����Ϊ :����ѧϰ�鷨  
		a.study("�鷨");	//	����ѧϰ�鷨   
		Action ac = new Son();
		ac.run();// �ô���ִ�����Ϊ�� �����ܲ�

		
	}
//}
//class Father{
//	public void study(String xuesha) {
//		System.out.println("����ѧϰ"+xuesha);
//	}
//	public Father() {}
//	
//}
//class Son extends Father implements Action{
//	String name;
//	public Son() {}
//	public Son(String name, int age) {
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public void run() {
//		System.out.println("�����ܲ�");
//	}
//	void Study() {
//		System.out.println("����ѧ�鷨");
//	}
//}
//interface Action{
//
//	void run();
//	//Action �ǽӿ�
	}



/**
 * ����
 */
class Father{
	public void study(String str) {
		System.out.println("����ѧϰ"+str);
	}
}
/**
 * �ӿ�
 */
interface Action{
	void run();
}
/**
 * ����
 */
class Son extends Father implements Action{
	private String name;
	private int age;
	public Son(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Son(String name) {
		this.name = name;
	}
	public Son() {
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void study(String str) {
		super.study(str);
		System.out.println("����ѧϰ"+str);
	}
	public void run() {
		System.out.println("�����ܲ�");
	}
	public void writer(){
		System.out.println("���ӻ�д����");
	}
}
