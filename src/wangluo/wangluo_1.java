/**
 * 
 */
package wangluo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author daixuan
 *
 * 2018��9��4��
 */
public class wangluo_1 {

	/**
	 * @param args
	 * ������ַ��ȡip��ַ����ȡ����ip��ַ
	 * һ�����̶�Ӧһ���˿�
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			InetAddress iad=InetAddress.getByName("www.baidu.com");
			System.out.println(iad.toString());
			System.out.println(iad.getLocalHost());
			System.out.println(iad.getHostName());
			//10���������Ƿ�ɴ�ָ����ַ
			System.out.println(iad.isReachable(10000));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
