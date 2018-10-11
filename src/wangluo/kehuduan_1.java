/**
 * 
 */
package wangluo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author daixuan
 *
 * 2018年9月4日
 */
public class kehuduan_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Socket s=new Socket("192.168.43.194", 9999);
			InputStream in=s.getInputStream();
			//把字节流转换为字符流
			//InputStreamReader isr=new InputStreamReader(in);
		
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			
			System.out.println(br.readLine().toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
