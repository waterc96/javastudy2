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
	 * ���л��뷴���л����Ƚϼ��ߣ����ڶ���json.
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		students s=new students("����",18);
		// ���л�
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));
		oos.writeObject(s);
		oos.close();
		//�����л�
		ObjectInputStream ins=new ObjectInputStream(new FileInputStream("a.txt"));
		students ss=(students)ins.readObject();
		System.out.println(ss);
		
		
		

	}

}
class students implements Serializable{
	String name;
	int age;
	transient int password;
	//��˲̬���εı����������л�
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
