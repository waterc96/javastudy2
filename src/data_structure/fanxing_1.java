package data_structure;
import java.util.*;
public class fanxing_1 {
	public static  void main(String[] args) {
		Point<String,Integer> pp=new Point<>();
		pp.setx("s");
		pp.sety(9);
		System.out.println(pp.getx()+","+pp.gety());
		Collection <Object>cc=new HashSet<>();
		cc.add("sda");
		cc.add(2);
		cc.add(new Point());
		System.out.println(cc);
		
	}
	
}
//����ʹ�÷��ͺ���Ļ����˺��������������Ͳ�һ�������Ρ�
class Point<T,V>{
	private T x;
	private V y;
	public void setx(T x) {
		this.x=x;
	}
	public T getx() {
		return x;
	}
	public void sety(V y) {
		this.y=y;
	}
	public V gety() {
		return y;
	}
}