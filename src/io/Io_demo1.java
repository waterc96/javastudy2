/**
 * 
 */
package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
/**
 * @author daixuan
 *
 * 2018年8月29日
 */
public class Io_demo1 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		File file=new File("G:\\javaee\\new_javajc\\a.txt");
		System.out.println(file.getName()+"是否存在："+file.exists());
		if (!(file.exists())) {
			file.createNewFile();
			System.out.println(file.getName()+"是否创建："+file.exists());
		}
		System.out.println(file.getName()+"是否存在："+file.exists());
		if (!(file.exists())) {
			file.createNewFile();
			System.out.println(file.getName()+"是否创建："+file.exists());
		}
		FileOutputStream out=new FileOutputStream(file);
//		FileOutputStream out1=new FileOutputStream(file1);
		//创建fileoutputstream对象
		Scanner sc=new Scanner(System.in);
		System.out.println("输入你要存的数据");
		String ss=sc.nextLine();
		byte buy[]=new byte[ss.length()];
		for(int i=0;i<ss.length();i++) {
			buy[i]=(byte) ss.charAt(i);
		}
		out.write(buy);//将数组中的信息写到文件中
		out.close();
		FileInputStream in = new FileInputStream(file);
		//创建fileinputstream类对象
		byte byt[]=new byte[1024];
		int len=in.read(byt);//从文件中读取信息
		System.out.println("文件中的信息是："+new String(byt,0,len));
		System.out.println("------------------------------------");
		//适用于文件字节比较大，数组初始长度不够的情况。
		StringBuffer stringBuffer = new StringBuffer();
		int len1=0;
		while ((len1 = in.read(byt)) != -1) {
			stringBuffer.append(new String(byt, 0, len1));
		}
		System.out.println("文件中的信息"+stringBuffer.toString());
		in.close();
		}	
	

	}

