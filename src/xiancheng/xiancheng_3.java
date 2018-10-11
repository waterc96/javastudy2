/**
 * 
 */
package xiancheng;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author daixuan
 *
 * 2018年9月2日
 */
public class xiancheng_3 {
	public static void main(String[] args) {
		Appledemo apple=new Appledemo();
		new Thread(apple,"成思潮").start();
		new Thread(apple, "梁玉民").start();
		new Thread(apple, "罗明智").start();
	}
}
class Appledemo implements Runnable{
	private int applenum=50;
	//new一个锁对象，在函数开始时一锁，结束时解锁。当一个线程抢到运行权时，在运行完之前不能其他线程不能进去、
	private final Lock lock = new ReentrantLock(true);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++) {
			eat1();
		}
	}
	public void eat() {
		if(applenum>0){
			System.out.println(Thread.currentThread().getName() + "吃了第"
					+applenum + "个苹果");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		applenum--;
	}
	public void eat1() {
		lock.lock();
		if(applenum>0){
			System.out.println(Thread.currentThread().getName() + "吃了第"
					+applenum + "个苹果");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		applenum--;
		lock.unlock();
		
	}
	
}
