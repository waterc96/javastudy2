/**
 * 
 */
package xiancheng;

/**
 * @author daixuan
 *
 * 2018年9月3日
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.json.JSONObject;

 
public class duandian {

	static int THREAD_COUNT = 3;
	private static int currentRunningThread = 3;
	static String DOWNLOAD_PATH = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1536397417333&di=cf6b608196eda7da177bdf1c9697eb70&imgtype=0&src=http%3A%2F%2Fpic2.52pk.com%2Ffiles%2F160216%2F5329500_160443_1.png ";

	public static void main(String[] args) throws UnknownHostException {
		
		try {
			URL url = new URL(DOWNLOAD_PATH);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(8000);
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept-Encoding", "identity"); // 加上这句话解决问题
			connection.connect();
			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				// 1、拿到要下载文件的大小并在本地创建一个与其一模一样大小的空文件
				int length = connection.getContentLength();
				System.out.println(length);
				File file = new File(getFileName(DOWNLOAD_PATH));
				RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
				randomAccessFile.setLength(length);
				randomAccessFile.close();

				// 3、计算每条线程要下载的区间
				int blockSize = length / THREAD_COUNT;
				for (int threadId = 0; threadId < THREAD_COUNT; threadId++) {
					int startIndex = threadId * blockSize;
					int endIndex = (threadId + 1) * blockSize - 1;
					if (threadId == (THREAD_COUNT - 1)) {
						endIndex = length - 1;
					}
					new DownLoadThread(DOWNLOAD_PATH, getFileName(DOWNLOAD_PATH), threadId, startIndex, endIndex)
							.start();
				}
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public static String getFileName(String path) {
		int index = path.lastIndexOf("/");
		return path.substring(index + 1);
	}

	static class DownLoadThread extends Thread {

		private String path;
		private String copyPath;
		private int threadId;
		private int startIndex;
		private int endIndex;
		private int currentPosition;

		public DownLoadThread(String path, String copyPath, int threadId, int startIndex, int endIndex) {
			this.path = path;
			this.copyPath = copyPath;
			this.threadId = threadId;
			this.startIndex = startIndex;
			this.endIndex = endIndex;
			this.currentPosition = startIndex;
		}

		@Override
		public void run() {

			try {
				URL url = new URL(path);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setConnectTimeout(8000);
				connection.setRequestMethod("GET");
				File f = new File(threadId + ".txt");
				File file = new File(copyPath);
				RandomAccessFile raf = new RandomAccessFile(file, "rw");
				if (f.exists() && f.length() > 0) {
					BufferedReader br = new BufferedReader(new FileReader(f));
					int alreadyWritePostion = Integer.parseInt(br.readLine());
					connection.setRequestProperty("range", "bytes=" + alreadyWritePostion + "-" + endIndex);
					raf.seek(alreadyWritePostion);
				} else {
					connection.setRequestProperty("range", "bytes=" + startIndex + "-" + endIndex);
					// 告诉raf从哪个位置开始写入
					raf.seek(startIndex);
				}

				connection.connect();
				if (connection.getResponseCode() == HttpURLConnection.HTTP_PARTIAL) {
					System.out.println("第" + (threadId + 1) + "条线程下载的区间是：" + startIndex + "---" + endIndex);

					InputStream is = connection.getInputStream();

					int len = 0;
					byte[] buf = new byte[20];
					while ((len = is.read(buf)) != -1) {
						raf.write(buf, 0, len);
						currentPosition += len;
						System.out.println("第" + (threadId + 1) + "正在下载   " + currentPosition + "   字节");
						File info = new File(threadId + ".txt");
						RandomAccessFile rf = new RandomAccessFile(info, "rwd");
						rf.write(String.valueOf(currentPosition).getBytes());
						rf.close();
					}
					raf.close();
					is.close();
					System.out.println("第" + (threadId + 1) + "条线程下载结束了");
				}

				synchronized (this) {
					currentRunningThread--;
					if (currentRunningThread <= 0) {
						for (threadId = 0; threadId < THREAD_COUNT; threadId++) {
							File fff = new File(threadId + ".txt");
							fff.delete();
						}
					}
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}



