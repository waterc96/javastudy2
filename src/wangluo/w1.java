/**
 * 
 */
package wangluo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author daixuan
 *
 * 2018年9月3日
 * 网络连接，拿到整个网页，有乱码，引进json
 */
public class w1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url=new URL("http://www.briup.com/index.php/android.html");
			URLConnection uc=url.openConnection();
			uc.connect();
			//-----------建立了连接
			//---------------输入流
			InputStream  in=uc.getInputStream();
			//输出流
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String s=null;
			StringBuffer StringBuffer=new StringBuffer();
			while((s=br.readLine())!=null) {
				StringBuffer.append(s+"\n");
			}
			System.out.println(StringBuffer.toString());
			br.close();
			in.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
