/**
 * 
 */
package io;

import java.io.File;

/**
 * @author daixuan
 *
 * 2018年8月29日
 */
public class File_demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("F:\\jjww");
		String s[]=file.list();
		for(String i:s) {
			System.out.println(i);
			if(i.contains("sd")) {
				String newname=i.replace("sd", "sb");
				File f=new File(file,i);
				f.renameTo(new File(file,newname));
				
			}
		}
		list(file);
	}
//对文件夹的遍历
	public static void list(File file) {
		File[]files=file.listFiles();
		for(File f:files) {
			System.out.println(f.getAbsolutePath());
			//  测试此抽象路径名表示的文件是否是一个目录。
			if(f.isDirectory()) {
				list(f);
			}
		}
		
	
	}
}
