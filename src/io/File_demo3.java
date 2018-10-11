/**
 * 
 */
package io;

import java.io.File;

/**
 * @author daixuan
 *给文件重命名
 * 2018年8月29日
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
