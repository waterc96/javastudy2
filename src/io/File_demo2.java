/**
 * 
 */
package io;

import java.io.File;

/**
 * @author daixuan
 *�ļ�������
 * 2018��8��29��
 */
public class File_demo2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	File f=new File("F:\\jjww");
	String[] ss=f.list();
	for(String s:ss) {
	if(s.endsWith(".txt")) {
	File ff=new File("F:\\jjww\\aabbc.txt");
	System.out.println("?");
	}
	}
		System.out.println(f.listFiles().toString());

	}

}
