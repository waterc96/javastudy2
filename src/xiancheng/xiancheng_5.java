/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018��9��3��
 */
public class xiancheng_5 {
	public static void main(String[] args) {
	Thread s1=new Thread1("ss");
	Thread w1=new Thread1("ww");
	Thread d1=new Thread1("dd");
	s1.start();
	try {
		s1.join();
		//�ȴ��߳���ֹ������s1��������������߳�
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	w1.start();
	w1.yield();
	//��ͣ��ǰ�̶߳���
	d1.start();
	
	
//setDaemon()
//	public final void setDaemon(boolean on)�����̱߳��Ϊ�ػ��̻߳��û��̡߳�
//���������е��̶߳����ػ��߳�ʱ��Java ������˳��� 
//	�÷��������������߳�ǰ���á� 
//	�÷������ȵ��ø��̵߳� checkAccess �������Ҳ����κβ�����������׳� SecurityException���ڵ�ǰ�߳��У��� 

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
