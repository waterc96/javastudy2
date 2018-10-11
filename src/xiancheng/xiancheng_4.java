/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 * 2018年9月2日
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
			food.zuo("包子","素"+i);
		}else {
			food.zuo("饺子","肉"+i);
		}
		
	}
	
}	
}
class Food{
	private String name;
	private String type;
	private boolean isEmpty = true;// 表示共享资源对象是否为空
	synchronized public void zuo(String name, String type) {
		try {
			while (!isEmpty) {
				this.wait();// 表示当前线程释放同步锁，进入等待池中，只能被其他线程所唤醒
			}
			// -------------------生产开始--------------------
			this.name = name;
			Thread.sleep(10);
			this.type = type;
			// -------------------生产结束---------------------
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
			// ------------------消费开始------------------------
			System.out.print(name + "	");
			Thread.sleep(10);
			System.out.println(type);
			// ---------------------消费结束-----------------
			isEmpty = true;
			this.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


