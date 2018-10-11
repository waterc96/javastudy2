/**
 * 
 */
package xiancheng;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author daixuan
 *
 * 2018年9月3日
 */
public class xiancheng_6 {

	public static void main(String[] args) {
	Timer timer=new Timer();
	timer.schedule(new TimerTask() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("时间到");
		}}, 3000,1000);
	
	}

}
