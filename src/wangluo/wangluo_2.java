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
 *���ӷ�����
 * 2018��9��4��
 */
public class wangluo_2 {
public static void main(String[] args) {
	
	try {
		ServerSocket ss=new ServerSocket(9999);
		System.out.println("��������9999�˿�����");
		while(true) {
			Socket socket=ss.accept();
			System.out.println("�пͻ�����������");
			OutputStream os=socket.getOutputStream(); 
			os.write(("��ǰ��������ʱ���� ").getBytes());
			os.close();
		//ss.close();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
