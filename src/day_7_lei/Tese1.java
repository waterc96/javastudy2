package day_7_lei;

public class Tese1 {
	public static void main(String[] args) {
		Country c=new Country(6);
		c.home();
		City ci=new City(6);
		ci.home();
		String aa=ci.ge("as");
		System.out.println(aa);
	}
	
}
class Country{
	private double mianji;
	private String name;
	Country(){System.out.println("�����޲�");}
	Country(int a){
		System.out.println("�����в�");
	}
	public double getMianji() {
		return mianji;
	}
	public void setMianji(double mianji) {
		this.mianji = mianji;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  void home() {
		System.out.println("home�й�");
	}
	public String ge(String a) {
		return a;
	}
	
	
}
class City extends Country{
	City(){System.out.println("�����޲�");}
	City(int c){
		//super�����๹�����е��ø���Ĺ�����
		super(7);
		System.out.println("�����в�");
	}
	public void home() {
		System.out.println("home�Ϻ�");
		//super������ķ����е��ø���ķ���
		super.home();
		super.setMianji(30);
		System.out.println(super.getMianji());
	}
}