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
	public car() {System.out.println("先调用我来完成初始化");}
	public car(String name) {System.out.println("先调用我来完成初始化11");}
	String name;
	double price;
	public int gongneng(int a) {
		System.out.println("能跑");
		return a;
	}
}
class Abc extends car{
	
	//super.gongneng(2);
	

}
