package day_6_shuzu;

import java.util.Arrays;
import java.util.Scanner;

import javax.annotation.Generated;

public class cassgame {
	static //表示玩家猜测的次数
	int time=0;
	//表示用户猜测的数据
//	static String input=null;
	static int [] result=new int[2];
	static char [] input=null;
	public static void main(String[] args) {
	System.out.println("欢迎尝试猜字母游戏,输入‘exit’退出游戏");
	Scanner sc=new Scanner(System.in);	
	char []chs=generate();
		
	while(true) {
		String intputer=sc.next().trim().toUpperCase();
		if("exit".equals(intputer)) {
			System.out.println("有空再来");
			break;
		}
		input=intputer.toCharArray();
		result=check(chs, input);
		if(result[0]==chs.length) {
			System.out.println("全部猜对，游戏结束");
			break;
		}else {
			System.out.println("你猜对了"+result[1]+"个字母,其中"+result[0]+"个字母顺序正确");
			time++;
			}
	}	
	}
	void sjj(Object a) {
		
	}
	//生成随机字母的方法
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


