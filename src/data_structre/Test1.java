package data_structre;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {
		
	public static void main(String[] args) {
		TreeSet <Shangping>treeSet=new TreeSet<>();
		// TODO Auto-g
		treeSet.add(new Shangping("D001", "X1", "a", 1, 3));
		treeSet.add(new Shangping("D002", "X2", "b", 2, 4));
		treeSet.add(new Shangping("D003", "X3", "c", 3, 5));
		treeSet.add(new Shangping("D004", "X4", "c", 4, 5));
		treeSet.add(new Shangping("D005", "X5", "c", 5, 6));
		treeSet.add(new Shangping("D006", "X5", "c", 5, 6));
		treeSet.add(new Shangping("D007", "X7", "d", 5, 7));
		treeSet.add(new Shangping("D008", "X8", "e", 6, 8));
		treeSet.add(new Shangping("D009", "X9", "e", 6, 8));
//		Iterator it=treeSet.iterator();
//		while(it.hasNext()) {
//			Shangping s=(Shangping) it.next();
//			System.out.println(s.age);
//		}
		System.out.println(treeSet);
			

	}

}
class Shangping{
	String sid;
	String sname;
	String sf;
	int age;
	int salenum;
	/**
	 * 
	 */
	public Shangping(String sid,String sname,String sf,int age,int salenum) {
		// TODO Auto-generated constructor stub
	this.salenum=salenum;
	this.sid=sid;
	this.sname=sname;
	this.sf=sf;
	this.age=age;
	
	
	}
	@Override
	public String toString() {
		return "Shangping [id=" + sid + ", name=" + sname + ", type=" + salenum + ", price=" + sf + ", count=" + salenum + "]\n";
	}
 
	
} 