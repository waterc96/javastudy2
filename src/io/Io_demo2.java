/**
 * 
 */
package io;

import java.io.*;

/**
 * @author daixuan
 *
 * 2018Äê8ÔÂ30ÈÕ
 */
public class Io_demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("a.txt");
		try {
			FileReader du=new FileReader(file);
//			char []cha=new char[5];
//			du.read(cha);
//			System.out.println(cha);
			StringBuffer StringBuffer=new StringBuffer();
			char chaar[]=new char[1024];
			int len=-1;
			while((len=du.read(	chaar))!=-1) {
				StringBuffer.append(chaar, 0, len);
			}
			System.out.println(StringBuffer.toString());
			du.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
