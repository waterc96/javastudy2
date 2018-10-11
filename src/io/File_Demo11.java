/**
 * 
 */
package io;

import java.io.File;
import java.util.Scanner;

/**
 * @author daixuan
 *
 * 2018Äê9ÔÂ9ÈÕ
 */
public class File_Demo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		File file=new File(name);
		File f[]=file.listFiles();
		for(File s:f) {
			File fi=new File(file,s.getName());
			System.out.println(fi.list());
			System.out.println(s);
		}

	}

}
