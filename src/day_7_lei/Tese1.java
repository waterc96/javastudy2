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
	Country(){System.out.println("父类无参");}
	Country(int a){
		System.out.println("父类有参");
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
		System.out.println("home中国");
	}
	public String ge(String a) {
		return a;
	}
	
	
}
class City extends Country{
	City(){System.out.println("子类无参");}
	City(int c){
		//super在子类构造器中调用父类的构造器
		super(7);
		System.out.println("子类有参");
	}
	public void home() {
		System.out.println("home上海");
		//super在子类的方法中调用父类的方法
		super.home();
		super.setMianji(30);
		System.out.println(super.getMianji());
	}
}