/**
 * 
 */
package io;

import java.io.File;

/**
 * @author daixuan
 *���ļ�������
 * 2018��8��29��
 */
public class File_demo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("G:\\java");
		if(!file.exists()) {
			file.mkdir();
		}
		String s=file.getName();
		if(s.equals("java")) {
			File file1 =new File("G:\\lalala");
			file.renameTo(file1);
		}
		System.out.println();

	}

}
