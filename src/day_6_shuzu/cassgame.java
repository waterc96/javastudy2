package day_6_shuzu;

import java.util.Arrays;
import java.util.Scanner;

import javax.annotation.Generated;

public class cassgame {
	static //��ʾ��Ҳ²�Ĵ���
	int time=0;
	//��ʾ�û��²������
//	static String input=null;
	static int [] result=new int[2];
	static char [] input=null;
	public static void main(String[] args) {
	System.out.println("��ӭ���Բ���ĸ��Ϸ,���롮exit���˳���Ϸ");
	Scanner sc=new Scanner(System.in);	
	char []chs=generate();
		
	while(true) {
		String intputer=sc.next().trim().toUpperCase();
		if("exit".equals(intputer)) {
			System.out.println("�п�����");
			break;
		}
		input=intputer.toCharArray();
		result=check(chs, input);
		if(result[0]==chs.length) {
			System.out.println("ȫ���¶ԣ���Ϸ����");
			break;
		}else {
			System.out.println("��¶���"+result[1]+"����ĸ,����"+result[0]+"����ĸ˳����ȷ");
			time++;
			}
	}	
	}
	void sjj(Object a) {
		
	}
	//���������ĸ�ķ���
	private static char[] generate() {
		char[] letters= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean []flags=new boolean[letters.length];
		char [] chs=new char[5];
		for (int i = 0; i < letters.length; i++) {
			int index;
			do {
				index=(int) (Math.random()*letters.length);
			}while(flags[index]);
			chs[i]=letters[index];
			flags[index]=true;
		}
		return chs;
	}
	private static int[] check(char[] input,char[] chs) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < chs.length; j++) {
				if(input[i]==chs[j]) {
					result[1]++;
					if (i==j) {
					result[0]++;
					}
					break;
				}
				
			}
			
		}
		
		return result;	
	}

}


