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
 *UDP,面向非连接，传输不可靠
 * 2018年9月5日
 */
public class sendDemo {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(20000);
		String s="虎虎生威";
		DatagramPacket dp = new DatagramPacket(s.getBytes(),
				s.getBytes().length, InetAddress.getLocalHost(), 10000);

		socket.send(dp);
		socket.close();
		
	}


}
