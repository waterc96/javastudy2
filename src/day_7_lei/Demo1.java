package day_7_lei;

public class Demo1 {

	public static void main(String[] args) {

		A a = new B1();
		a.method();// �� ��
		System.out.println(a.num);
		// �� ��
		B1 b = (B1) a;
		b.function();
	}
}
class A {
	int num = 10;
	public void method() {
		System.out.println("A��method");
	}

}

class B1 extends A {
	int num = 10;
	@Override
	public void method() {
		System.out.println("B1��method");
	}

	public void function() {
		System.out.println("B1��function");

	}

}
