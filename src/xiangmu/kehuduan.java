/**
 * 
 */
package xiangmu;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Collection;

/**
 * @author daixuan
 * 2018年9月20日
 */
public class kehuduan {

	private static Socket s;

	public static void main(String[] args) {
		try {
			s = new  Socket("127.0.0.1", 9999);
			log4j.logger.info("连接ok");
			//建立输出流，往服务器发信息并序列化data 
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			Collection<Environment> gather = new MyGather().gather();
			oos.writeObject(gather);
			log4j.logger.info("数据发送完毕");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
