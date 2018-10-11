/**
 * 
 */
package io;

import java.io.File;

/**
 * @author daixuan
 *文件过滤器
 * 2018年8月29日
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
