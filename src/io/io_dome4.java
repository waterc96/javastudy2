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
public class io_dome4 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1=new File("a.txt");
		File file2=new File("b.txt");
		if(!file2.exists()) {
			file2.createNewFile();
		}
		FileInputStream in1=new FileInputStream(file1);
		FileInputStream in2=new FileInputStream(file2);
		SequenceInputStream sis=new SequenceInputStream(in1,in2);
		int len=0;
		byte[] cc=new byte[1024];
		len=sis.read(cc);
		for(int i=0;i<cc.length;i++) {
			System.out.println(cc[i]);
		}
//		while((len=sis.read(cc))!=-1) {
//		}
		sis.close();
		
	}

}
