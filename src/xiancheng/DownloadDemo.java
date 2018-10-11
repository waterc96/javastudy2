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
 * 2018年9月3日
 */
public class DownloadDemo {
	private static int xian_num=3;
	private static String url_path="";
	//得到文件名字
	public static String getFilename( String path) {
		String path1[]=path.split("/");
		//spilt 根据给定正则表达式的匹配拆分此字符串。 
		return path1[path.length()-1];
	}
	public static void main(String[] args) throws Exception {

		URL url = new URL(url_path);
		//建立连接
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setReadTimeout(8000);
		conn.setConnectTimeout(8000);
		conn.setRequestMethod("GET");
		conn.connect();
		//如果从网上拿到的状态码的地址值ok的
		if(conn.getResponseCode()==HttpURLConnection.HTTP_OK) {
			int size=conn.getContentLength();
			File file=new File(getFilename(url_path));
			//此类的实例支持对随机访问文件的读取和写入。 setlength设置文件长度
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
	
