/**
 * 
 */
package io;

import java.io.File;

/**
 * @author daixuan
 *
 * 2018��8��29��
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
//���ļ��еı���
	public static void list(File file) {
		File[]files=file.listFiles();
		for(File f:files) {
			System.out.println(f.getAbsolutePath());
			//  ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼��
			if(f.isDirectory()) {
				list(f);
			}
		}
		
	
	}
}
