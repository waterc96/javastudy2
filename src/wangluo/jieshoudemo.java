/**
 * 
 */
package wangluo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author daixuan
 *
 * 2018Äê9ÔÂ5ÈÕ
 */
public class jieshoudemo {


	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket=new DatagramSocket(10000);
		
		byte[] buffer=new byte[1024];
		
		DatagramPacket datagramPacket=new DatagramPacket(buffer, 1024);
		
		socket.receive(datagramPacket);
		
		System.out.println(new String(buffer, 0, 
				datagramPacket.getLength(), "GBK"));
		
		socket.close();
		
}}
