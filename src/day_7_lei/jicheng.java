package day_7_lei;


public class jicheng {

	public static void main(String[] args) {
		//A t =new A("sa"); 
		car c=new car(" s");
		//Abc aa=new Abc("nj");
	}
}
class car {
	public String age;
	public car() {System.out.println("�ȵ���������ɳ�ʼ��");}
	public car(String name) {System.out.println("�ȵ���������ɳ�ʼ��11");}
	String name;
	double price;
	public int gongneng(int a) {
		System.out.println("����");
		return a;
	}
}
class Abc extends car{
	
	//super.gongneng(2);
	

}
