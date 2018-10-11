/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018年9月9日
 */
public class new_xianc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shan s=new shan();
		Thread t=new Thread(s);
		Thread t1=new Thread(new R());
		t1.start();
		t.start();
		
	}

}
class shan implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我闪现了");
	}
}
class R implements Runnable{

		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			System.out.println("放大招了");
		}
	
}