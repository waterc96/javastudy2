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
 * 2018��9��3��
 * �������ӣ��õ�������ҳ�������룬����json
 */
public class w1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url=new URL("http://www.briup.com/index.php/android.html");
			URLConnection uc=url.openConnection();
			uc.connect();
			//-----------����������
			//---------------������
			InputStream  in=uc.getInputStream();
			//�����
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
