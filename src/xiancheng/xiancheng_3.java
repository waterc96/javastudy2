/**
 * 
 */
package xiancheng;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author daixuan
 *
 * 2018��9��2��
 */
public class xiancheng_3 {
	public static void main(String[] args) {
		Appledemo apple=new Appledemo();
		new Thread(apple,"��˼��").start();
		new Thread(apple, "������").start();
		new Thread(apple, "������").start();
	}
}
class Appledemo implements Runnable{
	private int applenum=50;
	//newһ���������ں�����ʼʱһ��������ʱ��������һ���߳���������Ȩʱ����������֮ǰ���������̲߳��ܽ�ȥ��
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
			System.out.println(Thread.currentThread().getName() + "���˵�"
					+applenum + "��ƻ��");
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
			System.out.println(Thread.currentThread().getName() + "���˵�"
					+applenum + "��ƻ��");
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
