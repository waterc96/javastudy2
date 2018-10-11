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
 * 2018年9月4日
 */
public class wangluo_1 {

	/**
	 * @param args
	 * 根据网址获取ip地址，获取本机ip地址
	 * 一个进程对应一个端口
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			InetAddress iad=InetAddress.getByName("www.baidu.com");
			System.out.println(iad.toString());
			System.out.println(iad.getLocalHost());
			System.out.println(iad.getHostName());
			//10秒内主机是否可达指定地址
			System.out.println(iad.isReachable(10000));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
