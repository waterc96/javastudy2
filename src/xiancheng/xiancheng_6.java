/**
 * 
 */
package xiancheng;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author daixuan
 *
 * 2018��9��3��
 */
public class xiancheng_6 {

	public static void main(String[] args) {
	Timer timer=new Timer();
	timer.schedule(new TimerTask() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("ʱ�䵽");
		}}, 3000,1000);
	
	}

}
