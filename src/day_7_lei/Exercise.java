package day_7_lei;

public class Exercise {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Out o=new Out();
		Inner i=new Inner();
		int n=10;
		o.setx(n);
		i.sety(i);
		//i.getx().gety(100);
		//System.out.println(i.sety(n));
	}

}
class Out{
	private int x;
	public void setx(int x) {
		this.x=x;
	}
	public int getx() {
		return x;
	}
}
class Inner{
	private Inner y;
	public void sety(Inner y) {
		this.y=y;
	}
	public Inner gety() {
		return y;
	}
}