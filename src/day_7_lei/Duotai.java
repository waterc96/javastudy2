package day_7_lei;
/**
* ��̬�����Ա�ķ����ص� ��Ա����: ���뿴����,���п����� 
* ��Ա���������뿴��ߣ����п��ұ� 
* static����������
*/ 

public class Duotai {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Anmile a=new cat();
		a.eat();
		a.age=6;
		System.out.println(a.age);
	}
}
class Anmile {
	int age;
	String name;
public void eat() {System.out.println("�Է�");}
public void sleep() {}
}
class cat extends Anmile{
public void eat() {System.out.println("è����");}
}
class dog extends Anmile{}