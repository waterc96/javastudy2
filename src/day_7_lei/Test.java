package day_7_lei;


public class Test {
	public static void main(String[] args) {
		Son a = new Son("张三",18);//姓名：张三  年龄：18
		a.setName("李四");//李四表示姓名
		Father f = new Father();
		f.study("书法");//该代码执行输出为： 父亲学习书法
		Father f2 = new Son("李四",20);
		f2.study("书法");// 该代码执行输出为 :父亲学习书法  
		a.study("书法");	//	儿子学习书法   
		Action ac = new Son();
		ac.run();// 该代码执行输出为： 正在跑步

		
	}
//}
//class Father{
//	public void study(String xuesha) {
//		System.out.println("父亲学习"+xuesha);
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
//		System.out.println("正在跑步");
//	}
//	void Study() {
//		System.out.println("儿子学书法");
//	}
//}
//interface Action{
//
//	void run();
//	//Action 是接口
	}



/**
 * 父类
 */
class Father{
	public void study(String str) {
		System.out.println("父亲学习"+str);
	}
}
/**
 * 接口
 */
interface Action{
	void run();
}
/**
 * 子类
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
		System.out.println("儿子学习"+str);
	}
	public void run() {
		System.out.println("正在跑步");
	}
	public void writer(){
		System.out.println("儿子会写代码");
	}
}
