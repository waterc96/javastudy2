/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018年8月31日
 */
public class Xiancheng1 {

	public static void main(String[] args) {

		for(int i=0;i<50;i++) {
			System.out.println("打篮球");
			if(i==10) {
				Music m=new Music();
				Thread t=new Thread(m);
				t.start();
			}
		}
//使用匿名内部类创建线程
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//					for(int i=0;i<50;i++) {
//						System.out.println("打篮球"+i);
//				}
//			
//			}
//		}).start();
	}

}
class Music implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
//			Thread.sleep(200);
			for(int i=0;i<50;i++) {
		
					System.out.println("听音乐"+i);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}