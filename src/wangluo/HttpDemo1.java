/**
 * 
 */
package wangluo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * @author daixuan
 *
 * 2018��9��5��
 */
public class HttpDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("�������˺�");
//		String  name=sc.nextLine();
//		System.out.println("����������");
//		String password=sc.nextLine();
		try {
			doGet("","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	static void doGet(String userName, String passWord) throws Exception {

		URL url = new URL(
				"http://localhost:8888/BriupServer/LoginServlet?userName="
						+ userName + "&passWord=" + passWord);

		URLConnection connection = url.openConnection();

		connection.connect();

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(connection.getInputStream()));

		System.out.println(bufferedReader.readLine());

		bufferedReader.close();

	}
	
}
