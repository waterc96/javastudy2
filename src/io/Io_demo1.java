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
 * 2018��8��29��
 */
public class Io_demo1 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		File file=new File("G:\\javaee\\new_javajc\\a.txt");
		System.out.println(file.getName()+"�Ƿ���ڣ�"+file.exists());
		if (!(file.exists())) {
			file.createNewFile();
			System.out.println(file.getName()+"�Ƿ񴴽���"+file.exists());
		}
		System.out.println(file.getName()+"�Ƿ���ڣ�"+file.exists());
		if (!(file.exists())) {
			file.createNewFile();
			System.out.println(file.getName()+"�Ƿ񴴽���"+file.exists());
		}
		FileOutputStream out=new FileOutputStream(file);
//		FileOutputStream out1=new FileOutputStream(file1);
		//����fileoutputstream����
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�������");
		String ss=sc.nextLine();
		byte buy[]=new byte[ss.length()];
		for(int i=0;i<ss.length();i++) {
			buy[i]=(byte) ss.charAt(i);
		}
		out.write(buy);//�������е���Ϣд���ļ���
		out.close();
		FileInputStream in = new FileInputStream(file);
		//����fileinputstream�����
		byte byt[]=new byte[1024];
		int len=in.read(byt);//���ļ��ж�ȡ��Ϣ
		System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));
		System.out.println("------------------------------------");
		//�������ļ��ֽڱȽϴ������ʼ���Ȳ����������
		StringBuffer stringBuffer = new StringBuffer();
		int len1=0;
		while ((len1 = in.read(byt)) != -1) {
			stringBuffer.append(new String(byt, 0, len1));
		}
		System.out.println("�ļ��е���Ϣ"+stringBuffer.toString());
		in.close();
		}	
	

	}

