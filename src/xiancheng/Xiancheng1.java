/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018��8��31��
 */
public class Xiancheng1 {

	public static void main(String[] args) {

		for(int i=0;i<50;i++) {
			System.out.println("������");
			if(i==10) {
				Music m=new Music();
				Thread t=new Thread(m);
				t.start();
			}
		}
//ʹ�������ڲ��ഴ���߳�
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//					for(int i=0;i<50;i++) {
//						System.out.println("������"+i);
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
		
					System.out.println("������"+i);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}