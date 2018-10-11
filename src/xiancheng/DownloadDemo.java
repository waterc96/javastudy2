/**
 * 
 */
package xiancheng;

import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author daixuan
 *
 * 2018��9��3��
 */
public class DownloadDemo {
	private static int xian_num=3;
	private static String url_path="";
	//�õ��ļ�����
	public static String getFilename( String path) {
		String path1[]=path.split("/");
		//spilt ���ݸ���������ʽ��ƥ���ִ��ַ����� 
		return path1[path.length()-1];
	}
	public static void main(String[] args) throws Exception {

		URL url = new URL(url_path);
		//��������
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setReadTimeout(8000);
		conn.setConnectTimeout(8000);
		conn.setRequestMethod("GET");
		conn.connect();
		//����������õ���״̬��ĵ�ֵַok��
		if(conn.getResponseCode()==HttpURLConnection.HTTP_OK) {
			int size=conn.getContentLength();
			File file=new File(getFilename(url_path));
			//�����ʵ��֧�ֶ���������ļ��Ķ�ȡ��д�롣 setlength�����ļ�����
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			raf.setLength(size);
			
		}
	
	}
		
}
class download implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	
}	
	
