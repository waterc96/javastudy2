package wangluo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Xuleihua_1 {

	/**
	 * 序列化与反序列化，比较鸡肋，现在多用json.
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		students s=new students("玳萱",18);
		// 序列化
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));
		oos.writeObject(s);
		oos.close();
		//反序列化
		ObjectInputStream ins=new ObjectInputStream(new FileInputStream("a.txt"));
		students ss=(students)ins.readObject();
		System.out.println(ss);
		
		
		

	}

}
class students implements Serializable{
	String name;
	int age;
	transient int password;
	//用瞬态修饰的变量不被序列化
	/**
	 * 
	 */
	public students(String name,int age) {
		this.name=name;
		this.age=age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name"+name +"   age"+ age;
	}
	
}
