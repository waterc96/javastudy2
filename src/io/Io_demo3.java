/**
 * 
 */
package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author daixuan
 *�ַ���������ȽϷ��㣬����ֱ�Ӵӳ���д���ļ���
 * 2018��8��30��
 */
public class Io_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("G:\\java");
		if(!file.exists()) {
			file.mkdirs();
		}
		File file1 =new File("G:\\lalala");
		File file2 =new File("a.txt");
		try {
			FileWriter write=new FileWriter(file2,true);
			write.write("����Ÿ���");
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
