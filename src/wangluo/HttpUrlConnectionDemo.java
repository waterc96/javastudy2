/**
 * 
 */
package wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnectionDemo {

	static String BASE_URL_PATH = "http://v.juhe.cn/toutiao/index";

	public static void main(String[] args) {
		doPost();
	}

	public static void doPost() {

		try {
			URL url = new URL(BASE_URL_PATH);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setReadTimeout(8000);
			connection.setConnectTimeout(8000);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.connect();
			PrintWriter pw = new PrintWriter(connection.getOutputStream());
			pw.write("type=top&key=4c466deea24045a297e27ff0e623acda");
			pw.close();
			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				InputStream is = connection.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String s = "";
				StringBuilder stringBuilder = new StringBuilder();
				while ((s = br.readLine()) != null) {
					stringBuilder.append(s);
				}
				System.out.println(stringBuilder.toString());
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

	public static void doGet() {
		try {
			URL url = new URL(BASE_URL_PATH + "?type=top&key=4c466deea24045a297e27ff0e623acda");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setReadTimeout(8000);
			connection.setConnectTimeout(8000);
			connection.setRequestMethod("GET");
			connection.connect();

			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				InputStream is = connection.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String s = "";
				StringBuilder stringBuilder = new StringBuilder();
				while ((s = br.readLine()) != null) {
					stringBuilder.append(s);
				}
				System.out.println(stringBuilder.toString());
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

}
