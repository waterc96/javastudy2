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
 * 2018��9��4��
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
			//���ֽ���ת��Ϊ�ַ���
			//InputStreamReader isr=new InputStreamReader(in);
		
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			
			System.out.println(br.readLine().toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
