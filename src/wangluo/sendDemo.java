/**
 * 
 */
package wangluo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author daixuan
 *UDP,��������ӣ����䲻�ɿ�
 * 2018��9��5��
 */
public class sendDemo {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(20000);
		String s="��������";
		DatagramPacket dp = new DatagramPacket(s.getBytes(),
				s.getBytes().length, InetAddress.getLocalHost(), 10000);

		socket.send(dp);
		socket.close();
		
	}


}
