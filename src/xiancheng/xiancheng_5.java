/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018年9月3日
 */
public class xiancheng_5 {
	public static void main(String[] args) {
	Thread s1=new Thread1("ss");
	Thread w1=new Thread1("ww");
	Thread d1=new Thread1("dd");
	s1.start();
	try {
		s1.join();
		//等待线程终止方法，s1走完后再走其他线程
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	w1.start();
	w1.yield();
	//暂停当前线程对象
	d1.start();
	
	
//setDaemon()
//	public final void setDaemon(boolean on)将该线程标记为守护线程或用户线程。
//当正在运行的线程都是守护线程时，Java 虚拟机退出。 
//	该方法必须在启动线程前调用。 
//	该方法首先调用该线程的 checkAccess 方法，且不带任何参数。这可能抛出 SecurityException（在当前线程中）。 

}
}
class Thread1 extends Thread{
		String name;
	public Thread1(String name) {
		// TODO Auto-generated constructor stub
	this.name=name;
	}
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for (int i = 0; i <50; i++) {
			System.out.println(this.name+" "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
