/**
 * 
 */
package wangluo;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
import java.util.Date;
/**
 * @author daixuan
 *连接服务器
 * 2018年9月4日
 */
public class wangluo_2 {
public static void main(String[] args) {
	
	try {
		ServerSocket ss=new ServerSocket(9999);
		System.out.println("服务器在9999端口启动");
		while(true) {
			Socket socket=ss.accept();
			System.out.println("有客户端连进来了");
			OutputStream os=socket.getOutputStream(); 
			os.write(("当前服务器的时间是 ").getBytes());
			os.close();
		//ss.close();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
