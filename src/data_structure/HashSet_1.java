package data_structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet_1 {

	public static void main(String[] args) {
	
		HashMap <Integer,String> wcup=new HashMap<>();
		wcup.put(1930, "������");
        wcup.put(1934, "�����");
        wcup.put(1938, "�����");
        wcup.put(1950, "������");
        wcup.put(1954, "����");
        wcup.put(1958, "����");
        wcup.put(1962, "����");
        wcup.put(1966, "Ӣ����");
        wcup.put(1970, "����");
        wcup.put(1974, "����");
        wcup.put(1978, "����͢");
        wcup.put(1982, "�����");
        wcup.put(1986, "����͢");
        wcup.put(1990, "����");
        wcup.put(1994, "����");
        wcup.put(1998, "����");
        wcup.put(2002, "����");
        wcup.put(2006, "�����");
        wcup.put(2010, "������");
        wcup.put(2014, "�¹�");
        wcup.put(2018,"����");
        wcup.put(2088, "�й�");
        System.out.println("������һ�����");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(wcup.containsKey(year)) {
        	System.out.println(wcup.get(year)+"��"+year+"���������籭�ھ�");
        	if(wcup.get(year).equals(2088)) {
        		System.out.println("��");
        	}
        }else {
        	System.out.println("no worldcup!!");
        }
        System.out.println("������һ������");
        Scanner sc1=new Scanner(System.in);
        String  country=sc.next();
        if(wcup.containsValue(country)) {
        	for( Integer i:wcup.keySet()) {
        		if(wcup.get(i).equals(country)) {
        			System.out.println(i+"��ù����籭�ھ�");
        		}
        	}
        }else {
        	System.out.println("û�����籭�ھ�");
        }
        
		
		
	
	}

}
