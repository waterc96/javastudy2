/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 * 2018��9��2��
 */
public class xiancheng_4 {
	public static void main(String[] args) {
		Food food1=new Food();	
		new Thread(new guke(food1)).start();
		new Thread(new Chushi(food1)).start();
	}

}
class guke implements Runnable{
public Food food;
public guke(Food food) {
	// TODO Auto-generated constructor stub
	this.food = food;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	for (int i = 0; i < 50; i++) {
		food.chi();
	}
}
}
class Chushi implements Runnable{
public Food food;
/**
 * 
 */
public Chushi(Food food) {
	this.food=food;
}

@Override
synchronized public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<50;i++) {
		if(i%2==0) {
			food.zuo("����","��"+i);
		}else {
			food.zuo("����","��"+i);
		}
		
	}
	
}	
}
class Food{
	private String name;
	private String type;
	private boolean isEmpty = true;// ��ʾ������Դ�����Ƿ�Ϊ��
	synchronized public void zuo(String name, String type) {
		try {
			while (!isEmpty) {
				this.wait();// ��ʾ��ǰ�߳��ͷ�ͬ����������ȴ����У�ֻ�ܱ������߳�������
			}
			// -------------------������ʼ--------------------
			this.name = name;
			Thread.sleep(10);
			this.type = type;
			// -------------------��������---------------------
			isEmpty = false;
			this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void chi() {
		try {
			while (isEmpty) {
				this.wait();
			}
			// ------------------���ѿ�ʼ------------------------
			System.out.print(name + "	");
			Thread.sleep(10);
			System.out.println(type);
			// ---------------------���ѽ���-----------------
			isEmpty = true;
			this.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


