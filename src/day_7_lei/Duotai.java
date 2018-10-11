package day_7_lei;
/**
* 多态里面成员的访问特点 成员变量: 编译看左面,运行看左面 
* 成员方法：编译看左边，运行看右边 
* static方法：左，左
*/ 

public class Duotai {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Anmile a=new cat();
		a.eat();
		a.age=6;
		System.out.println(a.age);
	}
}
class Anmile {
	int age;
	String name;
public void eat() {System.out.println("吃饭");}
public void sleep() {}
}
class cat extends Anmile{
public void eat() {System.out.println("猫吃鱼");}
}
class dog extends Anmile{}